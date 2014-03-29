package com.examen.service.examens;

import java.util.Collection;

import com.examen.model.examens.Classe;
import com.examen.service.common.BasicEntityService;

public interface ClasseService extends BasicEntityService<Classe> {

	/*
	 * ADD
	 */
	String addClasse(Classe classe);

	Collection<Classe> findClasseByName(String Name);
	
	
}
