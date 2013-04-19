/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author i111057
 */
public class StartingBalanceControllerTest {
    
    public StartingBalanceControllerTest() {
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

    @Test
    public void testSetValue() {
        System.out.println("setValue Test");
        BigDecimal amount = new BigDecimal(0);
        StartingBalanceController instance = new StartingBalanceController();
        instance.setValue(amount);
        assertEquals(amount, instance.getValue());
    }

    @Test
    public void testGetValue() {
        System.out.println("getValue Test");
        StartingBalanceController instance = new StartingBalanceController();
        if(instance.getValue()==null)
            fail("The test case is a prototype.");
    }
}
