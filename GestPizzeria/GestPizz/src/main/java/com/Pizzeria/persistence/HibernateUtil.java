package com.Pizzeria.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
//import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static final SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		} catch (Exception ex) {
			System.out.println("echoue sessionFactory" + ex);
			throw new ExceptionInInitializerError();
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}