package jpa.entitymodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int cId;
	@Column(name="name")
	private String cName;
	@Column(name="instructor")
	private String cInstructorName;
	
	Course(){}
	
	public Course(String cName, String cInstructorName) {
		this.cName = cName;
		this.cInstructorName = cInstructorName;
	}

	public int getcId() {
		return cId;
	}

	public String getcName() {
		return cName;
	}

	public String getcInstructorName() {
		return cInstructorName;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public void setcInstructorName(String cInstructorName) {
		this.cInstructorName = cInstructorName;
	}

	@Override
	public String toString() {
		return cId + " " + cName + " " + cInstructorName;
	}

	

}
