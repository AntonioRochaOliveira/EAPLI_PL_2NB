/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.Collection;

import Model.PaymentType;


/**
 *
 * @author xiko
 */
public interface IPaymentTypeRepository  {
     PaymentType save(PaymentType paymentType);
     void delete(PaymentType paymentType);
     long size();    
     Collection<PaymentType> findAll();
}
