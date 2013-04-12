/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class TypeOfExpenseTest {
    
    public TypeOfExpenseTest() {
    }
    
    @BeforeClass
    public static void setUpClass()throws Exception {
    }
    
    @AfterClass
    public static void tearDownClass()throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDescription method, of class TypeOfExpense.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        TypeOfExpense instance = new TypeOfExpense();
        String expResult = instance.getDescription();
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class TypeOfExpense.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "teste";
        TypeOfExpense instance = new TypeOfExpense();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class TypeOfExpense.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TypeOfExpense instance = new TypeOfExpense();
        String expResult = instance.toString();
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}