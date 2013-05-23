/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.TypeOfExpense;
import Persistence.InMemory.TypeOfExpenseRepositoryImpl;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Karlos
 */
public class TypeOfExpenseRepositoryTest {
    
    public TypeOfExpenseRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        TypeOfExpense Texp = new TypeOfExpense("teste1","t1");
        TypeOfExpense Texp2 = new TypeOfExpense("teste2","t2");
        List<TypeOfExpense> listaTeste=new ArrayList<TypeOfExpense>();
        listaTeste.add(Texp);
        listaTeste.add(Texp2);
       
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListTExpense method, of class TypeOfExpenseRepository.
     */
    @Test
    public void testGetListTExpense() {
        System.out.println("getListTExpense");
        TypeOfExpenseRepository instance = new Persistence.JPA.TypeOfExpenseRepositoryImpl();
        List expResult = instance.getListTExpense();
        List result = instance.getListTExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class TypeOfExpenseRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        TypeOfExpense Texp = new TypeOfExpense("teste1","t1");
        TypeOfExpense Texp2 = new TypeOfExpense("teste2","t2");
        TypeOfExpenseRepository instance = new Persistence.JPA.TypeOfExpenseRepositoryImpl();
        instance.save(Texp);
        instance.save(Texp2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTypeOfExpenses method, of class TypeOfExpenseRepository.
     */
    @Test
    public void testGetAllTypeOfExpenses() {
        System.out.println("getListTExpenses");
        TypeOfExpenseRepository instance = new Persistence.JPA.TypeOfExpenseRepositoryImpl();
        List expResult = instance.getListTExpense();
        List result = instance.getListTExpense();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}