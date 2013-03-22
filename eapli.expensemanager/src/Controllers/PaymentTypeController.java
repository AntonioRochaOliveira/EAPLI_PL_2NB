/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentType;
import Model.PaymentTypeAditionalInformation;
import Presentation.PaymentTypeUI;

/**
 *
 * @author xiko
 */
public class PaymentTypeController {
    
    PaymentType paymentType;

    public PaymentTypeController() 
    {
        PaymentTypeUI paymentTypeUI = new PaymentTypeUI(this);
    }
    
    public PaymentType getPaymentType()
    {  
        return paymentType;
    }
    
    public void createCash()
    {
        paymentType=new PaymentType("Cash");
    }
    
    public void createCheque(int chequeNumber)
    {
        PaymentTypeAditionalInformation aditionalInformation=new PaymentTypeAditionalInformation();
        aditionalInformation.put("Number", chequeNumber);
        paymentType=new PaymentType("Cheque",aditionalInformation);
    }
    
     public void createCreditCard()
    {
         paymentType=new PaymentType("Credit Card");
    }
     
     public void createDebitCard()
     {
      paymentType=new PaymentType("Debit Card");
     }
    
}
