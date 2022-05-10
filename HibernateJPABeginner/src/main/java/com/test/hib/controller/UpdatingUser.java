package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class UpdatingUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		Transaction tx = session.beginTransaction();
		
		User u = new User();
		User u2 = new User();
		User u3 = new User();
		u.setId(4);
		u.setEmail("D@D.com");
		u.setFullname("D D");
		u.setPassword("DDDDD");
		u.setCity("D City");
		u.setAge(40);
		u.setSalary(40000.40);
		u2.setId(5);
		u2.setEmail("E@E.com");
		u2.setFullname("E E");
		u2.setPassword("EEEEE");
		u2.setCity("E City");
		u2.setAge(50);
		u2.setSalary(50000.50);
		u3.setId(6);
		u3.setEmail("F@F.com");
		u3.setFullname("F F");
		u3.setPassword("FFFFF");
		u3.setCity("F City");
		u3.setAge(60);
		u3.setSalary(60000.60);
		session.merge(u);
		session.merge(u2);
		session.merge(u3);
		session.getTransaction().commit();
		System.out.println("\n\nComplete!");
		session.close();
	}
}
