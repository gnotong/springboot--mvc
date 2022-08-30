package com.notgabs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.notgabs.entity.Course;
import com.notgabs.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {

		Student student = new Student("yann", "bull", "yb@em.com");
		Course courseJava = new Course("PHP");
		Course courseAngular = new Course("NuxtJS");

		student.addCourse(courseAngular);
		student.addCourse(courseJava);

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.getCurrentSession();

		try {
			session.beginTransaction();

			session.persist(student);
			session.flush();
			
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactory.close();
		}
	}
}
