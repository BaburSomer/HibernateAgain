package com.bilgeadam.boost.course02.lesson069;

import org.hibernate.Session;

public class SkillController {

	public void create (Skill entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
	}
}
