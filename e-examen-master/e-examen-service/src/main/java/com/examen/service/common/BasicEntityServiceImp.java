package com.examen.service.common;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.examen.model._base.BasicEntity;

public  class BasicEntityServiceImp<T extends BasicEntity> implements BasicEntityService<T> {

	@Autowired
	protected EntityManager em;
	
	protected transient final Class<T> clazz;

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


	public Collection<T> find(Class clazz, String query, String parm, Object valueOfparam) {
		Query myquery = em.createNamedQuery(query);
		myquery.setParameter(parm, valueOfparam);
		Collection<T> entities = myquery.getResultList();
		return entities;
	}
	
}
