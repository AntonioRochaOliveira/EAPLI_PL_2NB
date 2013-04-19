/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joel
 */
public class RegisterIncomeControllerTest {
    
    public RegisterIncomeControllerTest() {
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
     * Test of createIncome method, of class RegisterIncomeController.
     */
    @Test
    public void testCreateIncome() {
        
        System.out.println("createIncome");

        BigDecimal amount = BigDecimal.TEN;
        IncomeType incomeType = new IncomeType("tipo1", "Tipo de rendimento");
        String what = "teste de um create Income";
        Date date = new Date(2013, 12, 18);
        
        Income income = new Income(amount, incomeType, what, date);
        
        RegisterIncomeController controller = new RegisterIncomeController();
        controller.createIncome(amount, incomeType, what, date);

        List<Income> listIncome = IncomeRepository.getListIncome();
        
        assertTrue(listIncome.contains(income)); // erro Junit.framework.AssertionFailedError 
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
