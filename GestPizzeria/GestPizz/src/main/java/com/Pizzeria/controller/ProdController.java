package com.Pizzeria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProdController {
	
	
	
	@RequestMapping("/candidat")
	public String inscription(@RequestParam ("nom") String nom, @RequestParam ("prenom") String prenom){
		
		System.out.println(nom);
		System.out.println(prenom);
		
		
		return "repCandidat";
	}
	
}
