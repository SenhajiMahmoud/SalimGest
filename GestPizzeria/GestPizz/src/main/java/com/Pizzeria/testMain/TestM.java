package com.Pizzeria.testMain;

import java.util.List;

import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.Manager;

public class TestM {

	

	public static void main(String[] args) {
		
		Candidature c = new Candidature("sq", "d","dsq");
		
		Manager pm = new Manager();
		pm.Add(c);

	}

}
