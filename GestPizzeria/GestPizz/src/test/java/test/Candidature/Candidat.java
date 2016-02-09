package test.Candidature;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.HibernateUtil;
import com.Pizzeria.persistence.PersonneManager;
import com.Pizzeria.persistence.ServiceDAO;

public class Candidat {

	private static Candidature c;
	private static ServiceDAO pm;
	private List<Candidature> s, s1;
	@BeforeClass
	public static void bef() {
		c = new Candidature("sq", "d");
		pm = new PersonneManager();
	}

	@Test
	public void add() {
		s = pm.taille("candidatures");
		pm.add(c);
		s1 = pm.taille("candidatures");
		
		assertThat(s1).hasSize(s.size() + 1);
//		assertEquals(s.size() + 1, 2);
	}

	@AfterClass
	public static void aft() {
		HibernateUtil.getSessionFactory().close();
	}

}