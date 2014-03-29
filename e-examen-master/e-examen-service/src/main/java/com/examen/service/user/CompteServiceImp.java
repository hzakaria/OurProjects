package com.examen.service.user;

import org.springframework.stereotype.Service;

import com.examen.model.examens.Classe;
import com.examen.service.common.BasicEntityServiceImp;


@Service
public class CompteServiceImp   extends BasicEntityServiceImp<Classe> implements CompteService{

	public CompteServiceImp() {
		super(Classe.class);
	}

}
