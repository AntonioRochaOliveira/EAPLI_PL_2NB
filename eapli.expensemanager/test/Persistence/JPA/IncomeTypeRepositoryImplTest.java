package Persistence.JPA;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Model.IncomeType;
import Persistence.InMemory.IncomeTypeRepositoryImpl;

public class IncomeTypeRepositoryImplTest {
	Persistence.JPA.IncomeTypeRepositoryImpl repo;
	
	@Before
	public void setUp() throws Exception {
		repo = new Persistence.JPA.IncomeTypeRepositoryImpl();
	}

	@Test
	public void testSaveIncomeType() throws Exception {
		IncomeType income = new IncomeType("name", "description");
		repo.saveIncomeType(income);
		
		List<IncomeType> list = repo.getIncomeTypes();
		assertTrue(list.contains(income));		
	}

	@Test
	public void testGetIncomeTypes() throws Exception {
		//este teste realiza as mesmas operações que o teste de salvar no repositório.
		testSaveIncomeType();
	}

}