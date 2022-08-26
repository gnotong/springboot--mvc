package com.notgabs.mvc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.notgabs.mvc.entity.Student;

public class TestJdbc {

	public static void main(String[] args) {
		
		Student st = new Student("first", "last", "email@em.com");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		session.save(st);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
