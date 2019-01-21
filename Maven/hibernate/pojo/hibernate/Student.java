package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="student_database")
public class Student {

	@Id
	@Column(name="studentId")
	public Integer studentId;

	@Column(name="name")
	public String name;
	


	@Column(name="studentAge")
	public Integer studentAge;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}



	public Integer getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}

	
	 @OneToMany(mappedBy="studentId", fetch=FetchType.EAGER) public List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}