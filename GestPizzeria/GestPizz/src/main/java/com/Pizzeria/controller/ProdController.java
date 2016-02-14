package com.Pizzeria.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Pizzeria.business.Services;
import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.ManagerDAO;

@Controller
public class ProdController {
	
	@Autowired
	private Services dao;
	
	public Services getDao() {
		return dao;
	}

	public void setDao(Services dao) {
		this.dao = dao;
	}


	@RequestMapping("/candidat")
	public String inscription(@RequestParam ("nom") String nom, @RequestParam ("prenom") String prenom
								, @RequestParam ("adres") String adresse){
		Candidature d= new Candidature(nom, prenom, adresse);
		dao.Add(d);
		
		return "repCandidat";
	}
	
}
