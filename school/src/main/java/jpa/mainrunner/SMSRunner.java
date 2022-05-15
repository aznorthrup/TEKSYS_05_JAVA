package jpa.mainrunner;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;


public class SMSRunner {
	private Scanner scan = new Scanner(System.in);
	private StringBuilder sb;
	SessionFactory factory;
	Session session;
	Transaction t;
	
	private CourseService courseService;
	private StudentService studentService;
	private Student currentStudent;
	
// Creates scanner and session. Assigns session to Student & Course Service.
	public SMSRunner() {
		scan = new Scanner(System.in);
		sb = new StringBuilder();
		courseService = new CourseService();
		studentService = new StudentService();
		factory = new Configuration().configure().buildSessionFactory();
		session = factory.openSession();
		t = session.beginTransaction();
		studentService.setCurrentSession(session);
		courseService.setCurrentSession(session);
	}

// Begin session, start interface w/ user.
	
	public static void main(String[] args) {
		SMSRunner sms = new SMSRunner();
		sms.run();
	}
// Prompts whether to login or quit	
	private void run() {
		switch(menu1()) {
		case 1: 
			if (studentLogin()) {
				registerMenu();
			}break;
		case 2:
			System.out.println("Goodbye!");
			break;
		default:
			System.out.println("Not a viable entry");
		}
	}
// Requests choice
	private int menu1() {
		sb.append("\n1.Student Login\n2. Quit Application\nPlease Enter Selection: ");
		System.out.println(sb.toString());
		sb.delete(0, sb.length());

		return scan.nextInt();
	}
// Requests email
	private boolean studentLogin() {
		boolean retValue = false;
		Student s1;
		
// Validates that email exists. Repeats until valid.
		do {
			System.out.println("Enter your email address: ");
			String email = scan.next();
			s1 = studentService.getCurrentSession().get(Student.class, email);
			currentStudent = s1;
			continue;
		}while(studentService.getAllStudents().contains(s1) == false);
		
// Requests password
		
		System.out.println("Enter your password: ");
		String password = scan.next();
		
// Validates email matches password in database. Ends session if not.
		
		if (currentStudent.getsPassword().equals(password)) {
			List<Course> courses = studentService.getStudentCourses(currentStudent.getsEmail());
			System.out.println("My Classes:");
			System.out.println();
			System.out.printf("%s %-25s %-25s%n", "#", "COURSE NAME", "INSTRUCTOR NAME");
			for (Course course : courses) {
				System.out.printf("%s %-25s %-25s%n", course.getcId(), course.getcName(), course.getcInstructorName());
			}
			retValue = true;
		} else {
			System.out.println("User Validation failed. GoodBye!");
		}
		return retValue;
	}

// Displays courses and allows selection of new course
	
	private void registerMenu() {
		sb.append("\n1.Register a class\n2. Logout\nPlease Enter Selection: ");
		System.out.println(sb.toString());
		sb.delete(0, sb.length());

		switch (scan.nextInt()) {
		case 1:
			List<Course> allCourses = courseService.getAllCourses();
			List<Course> studentCourses = studentService.getStudentCourses(currentStudent.getsEmail());
			allCourses.removeAll(studentCourses);
			System.out.printf("%s %-25s %-25s%n", "#", "COURSE NAME", "INSTRUCTOR NAME");
			for (Course course : allCourses) {
				System.out.printf("%s %-25s %-25s%n", course.getcId(), course.getcName(), course.getcInstructorName());
			}
			System.out.println();
			System.out.println("Enter Course Number: ");
			int number = scan.nextInt();
			Course newCourse = courseService.getCourseById(number);
			
// Add session if it can. Ends session if course doesn't exist
			
			if (newCourse != null) {
				studentService.registerStudentToCourse(currentStudent.getsEmail(), newCourse.getcId());
				Student temp = studentService.getStudentByEmail(currentStudent.getsEmail());
				List<Course> sCourses = studentService.getCurrentSession().get(Student.class, temp.getsEmail()).getCourseList();
				System.out.println("MyClasses");
				for (Course course : sCourses) {
					System.out.println(course);
				}
				System.out.println("You have been signed out.");
			}else {
				System.out.println("Not a valid course!");
			}break;
		case 2:
		default:
			System.out.println("Goodbye!");
		}
	}
}
