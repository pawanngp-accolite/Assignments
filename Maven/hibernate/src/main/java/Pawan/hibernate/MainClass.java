package Pawan.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import hibernate.Course;
import hibernate.Student;

/**
 * Hello world!
 *
 */
public class MainClass {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		List<Course> courseList = new ArrayList<Course>();

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();
		Student st = new Student();
		st.setStudentId(18);
		st.setStudentAge(21);
		st.setname("pawan");
	
		Integer id = (Integer) session.save(st);
		session.getTransaction().commit();

		Session session1 = factory.openSession();
		session1.beginTransaction();
		Course cor = new Course();
		cor.setCourseId(105);
		cor.setCourseName("Hibernate2");
		cor.setStudentId(18);
		Integer id1 = (Integer) session1.save(cor);
		session1.getTransaction().commit();

		System.out.println(" ");
		System.out.println("OUTPUT STUDENT TABLE");
		Criteria cr = session.createCriteria(Student.class);
		cr.add(Restrictions.ge("studentAge", 15));
		cr.add(Restrictions.lt("studentAge", 23));
		studentList = cr.list();
		for (Student s : studentList) {
			System.out.println(
					s.getStudentId() + " " + s.getname() + " " + s.getStudentAge());
		}

		System.out.println(" ");
		System.out.println("OUTPUT COURSE TABLE");
		Criteria cr1 = session1.createCriteria(Course.class);
		cr1.add(Restrictions.eq("studentId", 1));
		cr1.add(Restrictions.eq("courseId", 101));
	courseList = cr1.list();
		for (Course c : courseList) {
			System.out.println(c.getCourseId() + " " + c.getCourseName() + " " + c.getStudentId());
		}

		System.out.println(" ");
		System.out.println("OUTPUT JOIN TABLE");
		for (Student student : studentList) {
		System.out.println(student.getname() +  "|" + student.getStudentAge()
					+ "|" + student.getStudentId() + "|"
					+ (!student.getCourses().isEmpty() ? student.getCourses().get(0).getCourseName() : ""));
		}
	}
}