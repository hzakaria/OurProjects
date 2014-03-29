package com.examen.model._base;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BasicEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
	protected Long id;

	public BasicEntity() {
		super();
	}

	public BasicEntity(final Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
