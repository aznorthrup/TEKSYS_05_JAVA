package com.example.entity;

import org.hibernate.annotations.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Entity
public class StudentEntity {
	public String name;
	public String studentRoleNumber;

	public StudentEntity() {}
	
	/*
	public StudentEntity(String name, String studentRoleNumber) {
		this.name = name;
		this.studentRoleNumber = studentRoleNumber;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentRoleNumber() {
		return studentRoleNumber;
	}

	public void setStudentRoleNumber(String studentRoleNumber) {
		this.studentRoleNumber = studentRoleNumber;
	}
*/
}
