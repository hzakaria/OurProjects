package com.examen.service.examens;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.examen.model.examens.Classe;

public class ClasseServiceImpTest {

	@Autowired
	private ClasseService classeService;
	
	@Before
	public void init()
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:/**/service.xml");
		classeService = (ClasseService) ctx.getBean("classeService");
	}

	@Test
	public void CreateClasse() {
		Classe entity = new Classe();
		entity.setName("A01");
		classeService.addClasse(entity);
		List<Classe> MyClasse = (List<Classe>) classeService.findClasseByName("A01");
	    assertNotNull("Object should exist", MyClasse.get(0));
	}
}
