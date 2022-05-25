package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.view.StudentView;

import lombok.Data;

public class StudentController {
// This is called dependency injection
	private StudentEntity model;
	private StudentView view;
	
	public StudentController(StudentEntity model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public StudentEntity getModel() {
		return model;
	}

	public void setModel(StudentEntity model) {
		this.model = model;
	}

	public void setView(StudentView view) {
		this.view = view;
	}
	
	public void updateView() {
		view.printStudentDetails(model.name, model.studentRoleNumber);
	}
	
	public void setStudentName(String name) {
		model.name=name;
	}
	
	public String getStudentName() {
		return model.name;
	}
	
	public String getStudentRoleNumber() {
		return model.studentRoleNumber;
	}
	
}
