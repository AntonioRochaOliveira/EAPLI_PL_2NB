/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.PayMode;
import Model.PaymentType;
import Persistence.IPayModeRepository;
import Persistence.IPaymentTypeRepository;
import Persistence.PersistenceFactory;
import Persistence.RepositoryFactory;
import java.util.Collection;
import java.util.HashMap;
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
public class PaymentTypeRepositoryImplTest {
    
    public PaymentTypeRepositoryImplTest() {
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
    public void saveAndFindAll() {
         
        IPaymentTypeRepository paymentTypeRep;
        paymentTypeRep =  new Persistence.JPA.PaymentTypeRepositoryImpl();
        
        PaymentType check = new PaymentType("Check");
        check.addAditionalInformationName("Number", "Integer");
        check.setId(1);
        
        paymentTypeRep.save(check);
        
       
        Collection<PaymentType> collection = paymentTypeRep.findAll();
        
        for (PaymentType object : collection) {
            System.out.println(object);
        }
        assert(collection.contains(check));
    }
}