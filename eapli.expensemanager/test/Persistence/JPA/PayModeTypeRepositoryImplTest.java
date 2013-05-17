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
public class PayModeTypeRepositoryImplTest {
    
    public PayModeTypeRepositoryImplTest() {
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
    public void saveAndGet() {
        IPayModeRepository payModeRep;
        payModeRep = new Persistence.JPA.PayModeTypeRepositoryImpl();
        
        IPaymentTypeRepository paymentTypeRep;
        paymentTypeRep = new Persistence.JPA.PaymentTypeRepositoryImpl();
        
        PaymentType check = new PaymentType("Check");
        check.addAditionalInformationName("Number", "Integer");
        check.setId(1);
        
        paymentTypeRep.save(check);
        
        HashMap map=new HashMap();
        map.put("Number", 256456);
        PayMode payMode = new PayMode(check,map);
        payModeRep.save(payMode);
        
        Collection<PayMode> collection = payModeRep.findAll();
        
        for (PayMode object : collection) {
            System.out.println(object);
        }
        assert(collection.contains(payMode));
    }
}