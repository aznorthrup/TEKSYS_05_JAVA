package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

@Entity
@Table( name="student_courses")

public class StudentService implements StudentDAO {
	private Session currentSession;
	private Transaction currentTransaction;
	
	public StudentService() {
		
	}
	
	public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }
 
    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }
     
    public void closeCurrentSession() {
        currentSession.close();
    }
     
    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }
     
    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }
    
    public Session getCurrentSession() {
        return currentSession;
    }
 
    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }
 
    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }
 
    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

// Returns a list of every student in the database
    
	@Override
	public List<Student> getAllStudents() {
		return getCurrentSession().createQuery("SELECT a FROM Student a", Student.class).getResultList();
	}

// Returns student with given email
	
	@Override
	public Student getStudentByEmail(String sEmail) {
		return (Student)getCurrentSession().get(Student.class, sEmail);
	}
	
// Ensures student exists in database

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		if (sEmail == null || sPassword == null) {
			System.out.println("Please fill out all sections");
			return false;
		}else if (getCurrentSession().get(Student.class, sEmail).getsEmail() == null) {
			System.out.println("No such student exists");
			return false;
		}else if (getCurrentSession().get(Student.class, sEmail).getsPassword() == sPassword) {
			return true;
		}else if (getCurrentSession().get(Student.class, sEmail).getsPassword() != sPassword) {
			System.out.println("Incorrect password!");
			return false;
		}return false;
		
	}

// Allows course to be added to student course list
	
	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		if (sEmail == null || getCurrentSession().get(Course.class, cId) == null) {
			System.out.println("Missing information to register student for course. Please try again.");
		}
		if(getCurrentSession().get(Student.class, sEmail) != null && getCurrentSession().get(Student.class, sEmail).getCourseList().contains(getCurrentSession().get(Course.class, cId)) != true) {
			getCurrentSession().get(Student.class, sEmail).getCourseList().add(getCurrentSession().get(Course.class, cId));
			System.out.println("Course added!");
		}else if (getCurrentSession().get(Student.class, sEmail) != null && getCurrentSession().get(Student.class, sEmail).getCourseList().contains(getCurrentSession().get(Course.class, cId)) == true){
			System.out.println("Student is already registered for this class!");
		}
	
	}

// Returns all student courses
	
	@Override
	public List<Course> getStudentCourses(String sEmail) {
		List<Course> regClasses = new ArrayList<Course>();
		if (getCurrentSession().get(Student.class, sEmail).getCourseList() == null) {
			System.out.println("No registered courses at present");
			return regClasses;
		}else if (getCurrentSession().get(Student.class, sEmail).getCourseList() != null) {
			return getCurrentSession().get(Student.class, sEmail).getCourseList();			
		}return regClasses;
	}

}
