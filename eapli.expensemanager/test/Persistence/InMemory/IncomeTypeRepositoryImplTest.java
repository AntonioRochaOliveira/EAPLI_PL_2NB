package Persistence.InMemory;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Model.IncomeType;

public class IncomeTypeRepositoryImplTest {
	IncomeTypeRepositoryImpl repo;
	
	@Before
	public void setUp() throws Exception {
		repo = (IncomeTypeRepositoryImpl) IncomeTypeRepositoryImpl.getInstance();
	}

	@Test
	public void testGetInstance() throws Exception {
		IncomeTypeRepositoryImpl otherInstance = (IncomeTypeRepositoryImpl) IncomeTypeRepositoryImpl.getInstance();
		
		//verifica se a referencia de ambas as instâncias do sibgleton é a mesma:
		assertEquals(repo, otherInstance);
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
