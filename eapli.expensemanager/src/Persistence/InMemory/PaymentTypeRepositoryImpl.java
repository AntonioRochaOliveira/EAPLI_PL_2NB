/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.PaymentType;
import Persistence.IPaymentTypeRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author xiko
 */
public class PaymentTypeRepositoryImpl implements IPaymentTypeRepository {
    private static PaymentTypeRepositoryImpl instance = null;
	
	private List<PaymentType> list;

	public static synchronized PaymentTypeRepositoryImpl getInstance() {
		
		if (instance == null)
			instance = new PaymentTypeRepositoryImpl();
		
		return instance;
	}
	
	private PaymentTypeRepositoryImpl(){
            //Create Default
		list = new ArrayList<PaymentType>();
                
	}

    @Override
	public PaymentType save(PaymentType paymentType) {
		list.add(paymentType);
        return paymentType;
	}
      

    @Override
    public void delete(PaymentType paymentType) {
         list.remove(paymentType);
       }

    @Override
    public long size() {
        return list.size();
        }


    @Override
    public Collection<PaymentType> findAll() {
    return list;   
    }
}
