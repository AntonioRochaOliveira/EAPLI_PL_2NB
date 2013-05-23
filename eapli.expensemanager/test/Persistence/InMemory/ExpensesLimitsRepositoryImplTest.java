/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.ExpensesLimits;
import Persistence.IExpensesLimitsRepository;
import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sdcastro
 */
public class ExpensesLimitsRepositoryImplTest {
    
    public ExpensesLimitsRepositoryImplTest() {
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
     * Test of getInstance method, of class ExpensesLimitsRepositoryImpl.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        IExpensesLimitsRepository expResult = null;
        IExpensesLimitsRepository result = ExpensesLimitsRepositoryImpl.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveLimits method, of class ExpensesLimitsRepositoryImpl.
     */
    @Test
    public void testSaveLimits() {
        System.out.println("saveLimits");
        ExpensesLimits expensesLimits = null;
        ExpensesLimitsRepositoryImpl instance = null;
        instance.saveLimits(expensesLimits);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeeklyLimit method, of class ExpensesLimitsRepositoryImpl.
     */
    @Test
    public void testGetWeeklyLimit() {
        System.out.println("getWeeklyLimit");
        ExpensesLimitsRepositoryImpl instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getWeeklyLimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}