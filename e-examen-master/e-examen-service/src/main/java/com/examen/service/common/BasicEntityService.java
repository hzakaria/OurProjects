package com.examen.service.common;

import java.util.Collection;

import com.examen.model._base.BasicEntity;
import com.examen.model.examens.Classe;


public interface BasicEntityService<T extends BasicEntity> {

	T find(final Long id);
	
    Collection<T> find(Class clazz, String query, String parm, Object valueOfparam);
}
