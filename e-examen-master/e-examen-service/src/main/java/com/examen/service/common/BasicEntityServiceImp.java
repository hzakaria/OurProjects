package com.examen.service.common;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examen.model._base.BasicEntity;
import com.examen.model.examens.Classe;


public abstract class BasicEntityServiceImp<T extends BasicEntity> extends AbstractService<Classe> implements BasicEntityService<T> {

	
	
	protected transient final Class<T> clazz;
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public BasicEntityServiceImp(final Class<T> clazz) {
		super();
		this.clazz = clazz;
	}

	@Transactional(readOnly = true)
	public T find(Long id) {
		if(id==null) {
			return null;
		}
		return em.find(clazz, id);
	}


	@Transactional(readOnly = true)
	public Collection<T> find(Class clazz, String query, String parm, Object valueOfparam) {
		Query myquery = em.createNamedQuery(query);
		myquery.setParameter(parm, valueOfparam);
		Collection<T> entities = myquery.getResultList();
		return entities;
	}
	
}
