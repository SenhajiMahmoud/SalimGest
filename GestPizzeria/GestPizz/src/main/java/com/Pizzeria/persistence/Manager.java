package com.Pizzeria.persistence;


import com.Pizzeria.business.Services;
import com.Pizzeria.models.Candidature;


public class Manager implements ManagerDAO{
	
	Services serv;

	
	public void Add(Candidature d) {
		serv.Add(d);
	}
	
//	public List<Candidature> taille(String nomTable) {
		
//		return serv.tailleTable(nomTable);
//	}

}
