/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.TypeOfExpense;
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
        TypeOfExpenseRepository instance = new TypeOfExpenseRepository();
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
        TypeOfExpense Texp = null;
        TypeOfExpenseRepository instance = new TypeOfExpenseRepository();
        instance.save(Texp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTypeOfExpenses method, of class TypeOfExpenseRepository.
     */
    @Test
    public void testGetAllTypeOfExpenses() {
        System.out.println("getAllTypeOfExpenses");
        TypeOfExpenseRepository instance = new TypeOfExpenseRepository();
        List expResult = instance.getAllTypeOfExpenses();
        List result = instance.getAllTypeOfExpenses();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}