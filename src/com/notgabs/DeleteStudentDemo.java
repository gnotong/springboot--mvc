package com.notgabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.notgabs.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session;

		try {
			session  = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			Student st = session.get(Student.class, 2);
			
			System.out.println(st);

			session.delete(st);

			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}
}
