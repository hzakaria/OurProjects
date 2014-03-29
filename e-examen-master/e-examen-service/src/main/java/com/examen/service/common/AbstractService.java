package com.examen.service.common;


import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.examen.model._base.BasicEntity;
import com.examen.model.examens.Classe;

public class AbstractService<T extends BasicEntity> {
	
	@Autowired
	protected EntityManager em;

	
	public AbstractService() {
		// TODO Auto-generated constructor stub
	}
	public AbstractService(EntityManager em) {
		super();
		this.em = em;
	}
	
//	abstract T find(Long id);
	
	

	
}