package com.Pizzeria.persistence;


import java.util.List;

import org.springframework.stereotype.Service;

import com.Pizzeria.business.DefaultServices;
import com.Pizzeria.business.Services;
import com.Pizzeria.models.Candidature;

@Service
public class PersonneManager implements ServiceDAO{
	
	Services serv = new DefaultServices();

	
	public void Add(Candidature d) {
		System.out.println("ok");
		serv.Add(d);
	}
	
	public List<Candidature> taille(String nomTable) {
		
		return serv.tailleTable(nomTable);
	}

}
