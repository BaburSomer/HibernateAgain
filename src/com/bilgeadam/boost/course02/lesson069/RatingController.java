package com.bilgeadam.boost.course02.lesson069;

import org.hibernate.Session;

public class RatingController {

	public void create (Rating entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
	}
}
