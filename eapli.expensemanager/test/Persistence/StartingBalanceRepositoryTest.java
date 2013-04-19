/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

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
public class StartingBalanceRepositoryTest {
    
    public StartingBalanceRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        BigDecimal expResult = new BigDecimal(0);
        StartingBalanceRepository aux = StartingBalanceRepository.instance();
        aux.setValue(expResult);
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
    public void testInstance() {
        System.out.println("instance Test");
        BigDecimal expResult = StartingBalanceRepository.getValue();
        StartingBalanceRepository result = StartingBalanceRepository.instance();
        assertEquals(expResult, result.getValue());
    }

    @Test
    public void testGetValue() {
        System.out.println("getValue Test");
        BigDecimal expResult = new BigDecimal(0);
        StartingBalanceRepository aux = StartingBalanceRepository.instance();
        aux.setValue(expResult);
        BigDecimal result = StartingBalanceRepository.getValue();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetValue() {
        System.out.println("setValue Test");
        BigDecimal value = new BigDecimal(100);
        StartingBalanceRepository.setValue(value);
        BigDecimal result = StartingBalanceRepository.getValue();
        assertEquals(value, result);
    }
}
