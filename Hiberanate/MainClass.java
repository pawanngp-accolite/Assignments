package Pawan.hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import hibernate.student;
import hibernate.Course;


public class MainClass {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		List<student> studentList = new ArrayList<student>();
		List<Course>CList = new ArrayList<Course>();
		System.out.println("Hello World!");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		session.beginTransaction();

		
student s = new student();
s.setStudentId(2);
s.setStudentName("ngp");
s.setStudentAge(21);

 Integer id = (Integer)session.save(s);
System.out.println(id);

		Criteria cr = session.createCriteria(Course.class);
		CList = cr.list();
		Criteria cr1 = session.createCriteria(student.class);
		studentList = cr1.list();
	cr.add(Restrictions.eq("studentId", 68));
		cr.add(Restrictions.disjunction().add(Restrictions.gt("studentAge", 21))
				.add(Restrictions.lt("studentAge", 35)));
		System.out.println(studentList.size());
		System.out.println(studentList.size());
		cr.add(Restrictions.eq("studentId",68));
		ListIterator<student> itr = studentList.listIterator();
		
		while (itr.hasNext()) {
			student st = itr.next();
		System.out.println(st.getStudentId() + " " + st.getStudentName() + " " + st.getStudentAge());
	}
		Course c = new Course();
		c.setCourseId(1);
		c.setCourseName("jee");
		c.setStudentId(1);
		session.save(c);
		
		ListIterator<Course> itr1 = CList.listIterator();
	
		while (itr1.hasNext()) {
			Course s1 = itr1.next();
			System.out.println(s1.getCourseId() + " " + s1.getStudentId() + " " + s1.getCourseName());
	}
		for(student student: studentList) {
			System.out.println( student.getStudentName()+"|" 
			+student.getStudentAge()+"|"
			+student.getStudentId()+"|"
			+(!student.getCourses().isEmpty()?student.getCourses().get(0).getCourseName()
			:"") ); }
		session.getTransaction().commit();
	}

}