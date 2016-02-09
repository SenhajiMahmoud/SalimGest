package com.Pizzeria.business;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.HibernateUtil;

public class DefaultServices implements Services {

	private Session session;

	public DefaultServices() {
		session = HibernateUtil.getSessionFactory().openSession();
	}

	public void Add(Candidature candidat) {
		session.beginTransaction();
			session.save(candidat);
		session.getTransaction().commit();

	}
	@SuppressWarnings("unchecked")
	public List<Candidature> tailleTable(String nomTable) {
		session.beginTransaction();
			String s = "select * from " + nomTable;
			SQLQuery sql = session.createSQLQuery(s);
			sql.addEntity(Candidature.class);
			
			List<Candidature> lis = sql.list();
		session.getTransaction().commit();
		return lis;
	}
}