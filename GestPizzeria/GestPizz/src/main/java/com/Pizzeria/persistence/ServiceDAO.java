package com.Pizzeria.persistence;

import java.util.List;

import com.Pizzeria.models.Candidature;

public interface ServiceDAO {
		public void Add(Candidature d);
		public List<Candidature> taille(String nomTable);
	}
