package Model;


import static org.junit.Assert.*;

import org.junit.Test;

public class IncomeTypeTest {

	@Test
	public void testIncomeType() throws Exception {
		String typeName = "typeName";
		String typeDescription = "typeDescription";
		IncomeType test = new IncomeType(typeName, typeDescription);
		
		assertEquals(typeName, test.getName());
		assertEquals(typeDescription, test.getDescription());
		
	}

	@Test
	public void testGetDescription() throws Exception {
		String typeName = "typeName";
		String typeDescription = "typeDescription";
		String typeDescriptionCopy = new String(typeDescription);
		IncomeType test = new IncomeType(typeName, typeDescription);
				
		//em primeiro lugar comparamos os  objetos que sabemos serem iguais:
		assertEquals(typeDescription, test.getDescription());
		//depois verificamos que o objeto não foi alterado depois de correr o construtor:
		assertEquals(typeDescriptionCopy, test.getDescription());
		
	}

	@Test
	public void testGetName() throws Exception {
		String typeName = "typeName";
		String typeNameCopy = new String(typeName);
		String typeDescription = "typeDescription";
		
		IncomeType test = new IncomeType(typeName, typeDescription);
		
		//em primeiro lugar comparamos os  objetos que sabemos serem iguais:
		assertEquals(typeName, test.getName());
		//depois verificamos que o objeto não foi alterado depois de correr o construtor:
		assertEquals(typeNameCopy, test.getName());
		
		//TODO: IncomeTypeTest: Criar teste com nome vazio! deveria retornar excepção, provavelmente.
	}

	@Test
	public void testSetDescription() throws Exception {
		String typeDescription = "typeDescription";
		String typeDescriptionCopy = new String(typeDescription);
		
		IncomeType test = new IncomeType("genericName", "genericDescription");
		
		test.setDescription(typeDescription);
		//em primeiro lugar comparamos os  objetos que sabemos serem iguais:
		assertEquals(typeDescription, test.getDescription());
		//depois verificamos que o objeto não foi alterado depois de correr o construtor:
		assertEquals(typeDescriptionCopy, test.getDescription());
		
	}

	@Test
	public void testSetName() throws Exception {
		String typeName = "typeName";
		String typeNameCopy = new String(typeName);
		IncomeType test = new IncomeType("genericName", "genericDescription");
		
		test.setName(typeName);
		
		//em primeiro lugar comparamos os  objetos que sabemos serem iguais:
		assertEquals(typeName, test.getName());
		//depois verificamos que o objeto não foi alterado depois de correr o construtor:
		assertEquals(typeNameCopy, test.getName());
	}

	@Test
	public void testEquals() throws Exception {
		String typeName = "typeName";
		String typeNameCopy = new String(typeName);
		String typeDescription = "typeDescription";
		String typeDescriptionCopy = new String(typeDescription);
		
		IncomeType testA = new IncomeType(typeName, typeDescription);
		IncomeType testB = new IncomeType(typeNameCopy, typeDescriptionCopy);
				
		assertTrue(testA.equals(testB));
		
		testB = new IncomeType(typeNameCopy, "other");
		assertFalse(testA.equals(testB));
		
		testB = new IncomeType("other", typeDescriptionCopy);
		assertFalse(testA.equals(testB));
		
	}

}
