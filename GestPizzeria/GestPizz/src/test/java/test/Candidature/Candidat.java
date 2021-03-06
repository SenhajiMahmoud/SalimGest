package test.Candidature;

//import static org.junit.Assert.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Pizzeria.business.DefaultServices;
import com.Pizzeria.business.Services;
import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.HibernateUtil;


public class Candidat {

	private static Candidature c;
	private List<Candidature> s, s1;
	
	@Autowired
	private Services pm;
	@BeforeClass
	public static void bef() {
		c = new Candidature("sq", "d", "dqs");
//		pm = new PersonneManager();
	}

	@Test
	public void add() {
		s = pm.tailleTable("candidatures");
		pm.Add(c);
		s1 = pm.tailleTable("candidatures");

		assertThat(s1).hasSize(s.size() + 1);
//		 assertEquals(s.size() + 1, 2);
	}

	@AfterClass
	public static void aft() {
		HibernateUtil.shutdown();
	}

}
