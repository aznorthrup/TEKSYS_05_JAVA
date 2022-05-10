package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class DeletingUser {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
	
		Transaction tx = session.beginTransaction();
	
		User u = new User();
		u.setId(11);
		User u2 = new User();
		u2.setId(15);
		User u3 = new User();
		u3.setId(16);
		User u4 = new User();
		u4.setId(17);
		User u5 = new User();
		u5.setId(18);
		User u6 = new User();
		u6.setId(19);
		User u7 = new User();
		session.delete(u);
		session.delete(u2);
		session.delete(u3);
		session.delete(u4);
		session.delete(u5);
		session.delete(u6);
		session.delete(u7);
		tx.commit();
		session.close();
		factory.close();
		
	}

}
