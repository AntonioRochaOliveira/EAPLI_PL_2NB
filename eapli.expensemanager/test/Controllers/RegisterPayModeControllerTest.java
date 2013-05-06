/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import Model.PayMode;
//import Persistence.PayModeRepository;
import Presentation.PayModeUI;
import java.util.List;
//import static org.mockito.Mockito.*;
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
public class RegisterPayModeControllerTest {
    RegisterPayModeController controller;
    public RegisterPayModeControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
//    @Before
//    public void setUp() {PayModeUI ui= mock(PayModeUI.class);
//        when(ui.getPaymentType(anyList())).thenReturn("Check");
//        when(ui.getAditionalInformation(anyString(),anyString())).thenReturn(12345);
//        controller = new  RegisterPayModeController(ui);
//    }
//    
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of buildCheckingAccount method, of class RegisterPayModeController.
//     */
//    @Test
//    public void testGetPayMode() { 
//        PayMode payMode=controller.getPayMode();
//        assertEquals(payMode.getPaymentTypeName(),"Check");
//    }
//    
//    /**
//     * Test of buildCheckingAccount method, of class RegisterPayModeController.
//     */
//    @Test
//    public void testBuildCheckingAccount() {
//        assertEquals(controller.buildCheckingAccount().getClass(),CheckingAccount.class);
//       
//    }
}