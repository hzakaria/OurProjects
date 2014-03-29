package com.examen.service.examens;

import java.util.Collection;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.examen.model.examens.Classe;
import com.examen.service.common.BasicEntityServiceImp;

@Service("classeService")
public class ClasseServiceImp extends BasicEntityServiceImp<Classe> implements ClasseService{

	public ClasseServiceImp() {
		super(Classe.class);
	}
	
	@Transactional(readOnly = false)
	public String addClasse(Classe classe) {
		em.persist(classe);
		return classe.getName();
	}

	@Transactional(readOnly = true)
	public Collection<Classe> findClasseByName(String Name) {
		return find(Classe.class, Classe.LOAD_Classe,"name","A01");
	}
	
	

}
