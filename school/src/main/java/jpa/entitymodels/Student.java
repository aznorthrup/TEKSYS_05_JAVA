package jpa.entitymodels;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student{
	@Id
	@Column(name="email")
	private String sEmail;
	@Column(name="name")
	private String sName;
	@Column(name="password")
	private String sPassword;
	@JoinTable
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> courseList;
	
	public Student() {}
	
	public Student(String sEmail, String sName, String sPassword) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPassword = sPassword;
	}

	public Student(String sEmail, String sName, String sPassword, List<Course> courseList) {
		this.sEmail = sEmail;
		this.sName = sName;
		this.sPassword = sPassword;
		this.courseList = courseList;
	}

	public String getsEmail() {
		return sEmail;
	}

	public String getsName() {
		return sName;
	}

	public String getsPassword() {
		return sPassword;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return ("Hello " + sName + "! We have your email as " + sEmail);
	}

	

}
