/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author João 
 */
public class MonthlyExpenseUITest {
    
    public MonthlyExpenseUITest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class MonthlyExpenseUI.
     */
    @Test
    public void testGetTitle() {
        
         System.out.println("getTitle Test");
        MonthlyExpenseUI instance = new MonthlyExpenseUI();
        String expResult = "* * *Monthly Expense* * *";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

   
}
