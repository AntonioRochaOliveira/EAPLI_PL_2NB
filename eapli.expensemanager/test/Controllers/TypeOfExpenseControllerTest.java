/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
public class TypeOfExpenseControllerTest {
    
    public TypeOfExpenseControllerTest() {
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
     * Test of TypeOfExpense method, of class TypeOfExpenseController.
     */
    @Test
    public void testTypeOfExpense() {
        System.out.println("TypeOfExpense");
        String description = "";
        String shortName = "";
        TypeOfExpenseController instance = new TypeOfExpenseController();
        instance.TypeOfExpense(description, shortName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}