package com.notgabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.notgabs.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session;

		try {
			session  = sessionFactory.getCurrentSession();
			session.beginTransaction();

			Student st = session.load(Student.class, 1);
			
			st.setFirstName("John");
			st.setLastName("Doe");
			st.setEmail("j.d@example.com");

			session.getTransaction().commit();
			
			// BULK UPDATE
			session  = sessionFactory.getCurrentSession();
			session.beginTransaction();

			session.createQuery("update Student set email='baba@b.com'").executeUpdate();

			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}
}
