/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;
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
public class PaymentTypeTest {
    
   String name;
    Map<String,String>aditionalInformationNames;
    PaymentType pt = new PaymentType();
    
    
    
//    public PaymentTypeTest(String name) {
//        this.aditionalInformationNames = new HashMap<String,String>();
//        this.name = name;
//    }
    
    public PaymentTypeTest(){
        
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
     * Test of addAditionalInformationName method, of class PaymentType.
     */
    @Test
    public void testAddAditionalInformationName() {
        System.out.println("Get Aditional Information Name Test");
       
        String key = "test";
        String value = "teste1";
        PaymentType instance = new PaymentType();
        instance.addAditionalInformationName(key, value);
       
        assertEquals(key, value);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAditionalInformationNames method, of class PaymentType.
     */
    @Test
    public void testGetAditionalInformationNames() {
        
        
        System.out.println("addAditionalInformationNames");
        String key = "test";
        String value = "teste1";
        PaymentType instance = new PaymentType();
        instance.addAditionalInformationName(key, value);
        aditionalInformationNames.containsKey(key);
        aditionalInformationNames.containsKey(value);
        assertEquals(aditionalInformationNames.containsKey(key), aditionalInformationNames.containsKey(value));
        fail("The test case is a prototype.");
       
    }

    /**
     * Test of getName method, of class PaymentType.
     */
    @Test
    public void testGetName() {
            assertEquals(pt.getName(), name);     
    }
}