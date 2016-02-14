package com.Pizzeria.business;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.HibernateUtil;

@Service
public class DefaultServices implements Services {
	
	@Autowired
	private SessionFactory SF;

	public void setSF(SessionFactory sF) {
		SF = sF;
	}

	@Transactional
	public void Add(Candidature candidat) {
		SF.getCurrentSession().save(candidat);
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
