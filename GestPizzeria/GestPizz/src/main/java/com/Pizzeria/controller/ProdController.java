package com.Pizzeria.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Pizzeria.business.Services;
import com.Pizzeria.models.Candidature;
import com.Pizzeria.persistence.ServiceDAO;

@Controller
public class ProdController {
	
	@Autowired
	private ServiceDAO dao;
	
	
	@RequestMapping("/candidat")
	public String inscription(@RequestParam ("nom") String nom, @RequestParam ("prenom") String prenom, @RequestParam ("adres") String adresse){
		
		dao.Add(new Candidature(nom, prenom, adresse));
		
		return "repCandidat";
	}
	
}
