/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.PaymentType;
import Persistence.IPaymentTypeRepository;

/**
 *
 * @author xiko
 */
public class PaymentTypeRepositoryImpl extends JpaRepository<PaymentType,Integer>implements IPaymentTypeRepository{ 
}
