package com.test.project.HibernateJPABeginner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.controller.findUser_Hql;
import com.test.hib.model.User;

public class App{

	public static void main(String[] args) {
	
		findUser_Hql u = new findUser_Hql();
		u.findUser();
		u.findUserSelect();
		u.getRecordbyId();
		u.getMaxSalary();
		u.countUsers();
	}

}