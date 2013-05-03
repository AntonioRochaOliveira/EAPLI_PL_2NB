/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Márcio
 */
public class ExpenseTest {
    
    public ExpenseTest() {
        
        
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
     * Test of getType method, of class Expense.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Expense instance = new Expense(new BigDecimal(10),new TypeOfExpense("Carro","Descrição"),new Date(2013, 04, 19),new PayMode(null, null),"Lavagem Auto");
        String expResult = "Carro";
        String result = instance.getType().getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class Expense.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        TypeOfExpense type = new TypeOfExpense("Carro","Descrição");
        Expense instance = new Expense(new BigDecimal(10),null,new Date(2013, 04, 19),new PayMode(null, null),"Lavagem Auto");
        instance.setType(type);
        String expResult = "Carro";
        String result = instance.getType().getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDate method, of class Expense.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        TypeOfExpense type = new TypeOfExpense("Carro","Descrição");
        Expense instance = new Expense(new BigDecimal(10),null,null,new PayMode(null, null),"Lavagem Auto");
        instance.setDate(new Date(2013, 04, 19));
        int expResult = 4;
        int result = instance.getDate().getMonth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

//    /**
//     * Test of getPayM method, of class Expense.
//     */
//    @Test
//    public void testGetPayM() {
//        System.out.println("getPayM");
//        Expense instance = new Expense();
//        PayMode expResult = null;
//        PayMode result = instance.getPayM();
//        assertEquals(expResult, result);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPayM method, of class Expense.
//     */
//    @Test
//    public void testSetPayM() {
//        System.out.println("setPayM");
//        PayMode payM = null;
//        Expense instance = new Expense();
//        instance.setPayM(payM);
//         TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}