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
 * @author Castro
 */
public class PayModeTest {
    PayMode pm = new PayMode();
    String name;
    
    public PayModeTest() {
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
     * Test of getPaymentTypeName method, of class PayMode.
     */
    @Test
    public void testGetPaymentTypeName() {
          assertEquals(pm.equals(name), name);   
    }

    /**
     * Test of toString method, of class PayMode.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PayMode instance = null;
        String expResult = "Output";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}