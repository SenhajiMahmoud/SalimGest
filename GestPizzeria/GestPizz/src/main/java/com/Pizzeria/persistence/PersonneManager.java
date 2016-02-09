package com.Pizzeria.persistence;


import java.util.List;

import com.Pizzeria.business.DefaultServices;
import com.Pizzeria.business.Services;
import com.Pizzeria.models.Candidature;

public class PersonneManager implements ServiceDAO{
	
	Services serv = new DefaultServices();

	
	public void add(Candidature d) {
			
		serv.Add(d);
	}
	
	public List<Candidature> taille(String nomTable) {
		
		return serv.tailleTable(nomTable);
	}

}
