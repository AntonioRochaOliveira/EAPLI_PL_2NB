/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
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
public class StartingBalanceUITest {
    
    public StartingBalanceUITest() {
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
    public void testGetTitle() {
        System.out.println("getTitle Test");
        StartingBalanceUI instance = new StartingBalanceUI();
        String expResult = "* * * STARTING BALANCE * * *";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }
}
