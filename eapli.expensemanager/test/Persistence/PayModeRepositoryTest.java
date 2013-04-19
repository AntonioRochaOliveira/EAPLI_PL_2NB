/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PayMode;
import Model.PaymentType;
import java.util.HashMap;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xiko
 */
public class PayModeRepositoryTest {
    
    public PayModeRepositoryTest() {
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
     * Test of getInstance method, of class PayModeRepository.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        PayModeRepository expResult = null;
        PayModeRepository result = PayModeRepository.getInstance();
         assertEquals(PayModeRepository.class, result.getClass());
    }
    /**
     * Test of save method, of class PayModeRepository.
     */
    @Test
    public void testSaveAndGet() {
        System.out.println("Save and GetAll");
        PaymentType credit = new PaymentType("Credit card"); 
        PayMode payMode = new PayMode(credit,new HashMap());
        
        
        PayModeRepository instance = PayModeRepository.getInstance();
        instance.save(payMode);
        Boolean bool;
        bool = instance.getPayMode().contains(payMode);
        assertEquals(bool,true);
        
        }

}