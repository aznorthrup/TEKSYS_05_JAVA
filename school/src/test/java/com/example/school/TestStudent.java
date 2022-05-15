package com.example.school;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.StudentService;

public class TestStudent {
//	Tests creation of a student
	
	@Test
	public void testStudentNameAndEmail() {
		Student s1 = new Student("test@test.com", "Test Student", "testPass");
		
		String expected = "Hello Test Student! We have your email as test@test.com";
		String actual = s1.toString();

		assertEquals(expected, actual);
	}
	
//	Tests creation of a student password
	
	@Test
	public void testStudentPassword() {
		Student s2 = new Student("test@test.com", "Test Student", "testPass");
		
		String expected2 = "testPass";
		String actual2 = s2.getsPassword();
		
		assertEquals(expected2, actual2);
	}
	
//	Tests creation of a course
	
	@Test
	public void testCourse() {
		Course c1 = new Course("Math", "Hamlin");
		
		String expected3 = "Math Hamlin";
		String actual3 = (c1.getcName() + " " + c1.getcInstructorName());
		
		assertEquals(expected3, actual3);
	}
	
// Tests student validation in database
	
	@Test
	public void testStudentValidation() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Student s3 = new Student("test@test.com", "Test Student", "testPass");
		StudentService studentService = new StudentService();
		studentService.setCurrentSession(session);
		session.save(s3);
		boolean expected4 = true;
		boolean actual4 = studentService.validateStudent(s3.getsEmail(), s3.getsPassword());
		
		assertEquals(expected4, actual4);
	}
	
}
