package com.Pizzeria.business;

import java.util.List;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.HibernateUtil;

@Service
public class DefaultServices implements Services {
	
	Session session;
	
	public DefaultServices() {
		session = HibernateUtil.getSessionFactory().getCurrentSession();
	}
	public void Add(Candidature candidat) {
		
		
		System.out.println("ok2");
		session.beginTransaction();	
		
			session.save(candidat);
		session.getTransaction().commit();
		

	}
	@SuppressWarnings("unchecked")
	public List<Candidature> tailleTable(String nomTable) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
			String s = "select * from " + nomTable;
			SQLQuery sql = session.createSQLQuery(s);
			sql.addEntity(Candidature.class);
			
			List<Candidature> lis = sql.list();
		session.getTransaction().commit();
		return lis;
	}
}
