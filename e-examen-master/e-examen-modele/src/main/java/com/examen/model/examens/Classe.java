package com.examen.model.examens;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;

import javax.persistence.NamedQueries;

import com.examen.model._base.BasicEntity;

@Entity
@NamedQueries({
	@NamedQuery(name = Classe.LOAD_Classe, query = "SELECT c FROM Classe c WHERE c.name=:id")
	})
public class Classe extends BasicEntity{
	
	public static final String LOAD_Classe = "Classe.loadClasse";
	
	@Column(unique = true, nullable = false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Classe [name=" + name + "]";
	}
	
	
}
