package com.simplilearn.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.simplilearn.model.Classes;
import com.simplilearn.model.Student;
import com.simplilearn.model.Subject;
import com.simplilearn.model.Teacher;

public class HibernateUtil {

	public static SessionFactory buildSessionFactory() {

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(Subject.class)
				.addAnnotatedClass(Classes.class)
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
				
		return sessionFactory;
	}
}
