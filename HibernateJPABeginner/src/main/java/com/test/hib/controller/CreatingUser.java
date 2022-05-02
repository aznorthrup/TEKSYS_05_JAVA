package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;

public class CreatingUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();   
    	User uone = new User("Moh Haseeb","haseeb@gmail.com","has123",20,2000.69,"NYC");	
    	User utwo = new User("James Santana","James@gmail.com","James123",25,2060.69,"Dallas");
    	User uthree = new User("AH Shahparan","Shahparan@gmail.com","Shahparan123",30,3060.69,"Chicago");
    	User ufour = new User("Bruce", "bruce@thebrucester.com", "153697", 35, 38024.2, "NY");
    	User ufive = new User("Sid", "Sid@hfduiew.com", "gfrergr4856", 28, 50000.5, "NJ");
    	Integer userid = null;
    	session.save(uone);
    	session.save(utwo);
    	session.save(uthree);
    	session.save(ufour);
    	session.save(ufive);
    	t.commit();
    	System.out.println("Successfully saved!");
    	factory.close();
    	session.close();
		
	}
}
