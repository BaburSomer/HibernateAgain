package com.bilgeadam.boost.course02.lesson069;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = sessionFactoryHibernate(); 
	
	private static SessionFactory sessionFactoryHibernate() {
		SessionFactory factory = null;
		try {
			Configuration config = new Configuration(); // instance oluşturduk
			
			config.addAnnotatedClass(Person.class); //entity sınıflarımızı burada hibernate'e tanıtmamız gerekli
													// bu işin java jargonunda adı "register etmek"tir
			
			config.addAnnotatedClass(Skill.class);
			config.addAnnotatedClass(Rating.class);
			
			factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		catch (Exception ex) {
			System.err.println("Something went terribly wrong: " + ex.getMessage());
		}
		return factory;
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
