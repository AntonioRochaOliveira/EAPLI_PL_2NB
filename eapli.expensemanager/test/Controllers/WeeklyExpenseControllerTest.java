/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PayMode;
import Model.PaymentType;
import Model.TypeOfExpense;
import Persistence.IPaymentTypeRepository;
import Persistence.PersistenceFactory;
import Persistence.RepositoryFactory;
import java.math.BigDecimal;
import java.util.Date;
import java.util.GregorianCalendar;
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
public class WeeklyExpenseControllerTest {

    public WeeklyExpenseControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        RepositoryFactory repFac = PersistenceFactory.buildPersistenceFactory();
        IPaymentTypeRepository paymentTypeRep = repFac.buildPaymentTypeRepository();


        PaymentType money = new PaymentType("Money");
        money.setId(1);

        paymentTypeRep.save(money);

        ExpenseRegisterController instance = new ExpenseRegisterController();
        
        //Despesa na mesma semana
        BigDecimal amount = new BigDecimal(100);
        TypeOfExpense type = new TypeOfExpense("Almoço", "Descrição");
        Date date = new GregorianCalendar(2013, 5, 22).getTime();
        PayMode payM = null;
        String comment = "Almoço de Amigos";
        
        instance.registerExpense(amount, type, date, payM, comment);
        
        //Despesa há muito semana
        amount = new BigDecimal(50);
        type = new TypeOfExpense("Almoço", "Descrição");
        date = new GregorianCalendar(2012, 3, 12).getTime();
        payM = null;
        comment = "Outro Almoço de Amigos";
        
        instance.registerExpense(amount, type, date, payM, comment);
        
 
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of buildCheckingAccount method, of class WeeklyExpenseController.
     */
    @Test
    public void testGetWeeklyExpense() {
        System.out.println("getWeeklyExpense");
        WeeklyExpenseController instance = new WeeklyExpenseController();
        BigDecimal expResult = new BigDecimal(100);
        BigDecimal result = instance.getWeeklyExpense();
        assertEquals(expResult, result);
        
    }
}