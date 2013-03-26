/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.PaymentType;
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
    
    public void createPaymentType(String type)
    {
        paymentType=new PaymentType(type);
    }
    
    public void addAditionalInformation(String key, Object Value)
    {
        paymentType.addAditionalInformation(key, Value);
    }
}