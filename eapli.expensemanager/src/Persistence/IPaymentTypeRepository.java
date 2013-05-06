/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentType;
import java.util.List;


/**
 *
 * @author xiko
 */
public interface IPaymentTypeRepository  {
     PaymentType save(PaymentType paymentType);
     void delete(PaymentType paymentType);
     long size();    
     List<PaymentType> all();
}
