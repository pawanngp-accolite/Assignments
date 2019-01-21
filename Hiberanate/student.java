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
@Table(name="students")
public class student {

@Id
@Column(name="student_Id")

public Integer studentId;

@Column(name="student_Name")
public String studentName;

@Column(name="student_Age")
public Integer studentAge;

public Integer getStudentId() {
return studentId;
}

public void setStudentId(Integer studentId) {
this.studentId = studentId;
}

public String getStudentName() {
return studentName;
}

public void setStudentName(String studentName) {
this.studentName = studentName;
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