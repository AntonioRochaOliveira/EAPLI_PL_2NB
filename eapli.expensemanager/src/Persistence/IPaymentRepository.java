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
public interface IPaymentRepository {
       void save(Object obj);
     
      public List getAll();
   
}
