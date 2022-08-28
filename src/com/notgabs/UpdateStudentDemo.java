package com.notgabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.notgabs.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session;

		try {
			session  = sessionFactory.getCurrentSession();
			session.beginTransaction();
			
			Student st = session.get(Student.class, 2);

			session.delete(st);

			session.getTransaction().commit();

			//
			
			session  = sessionFactory.getCurrentSession();
			session.beginTransaction();

			session.createQuery("delete from Student where id=3").executeUpdate();

			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}
}
