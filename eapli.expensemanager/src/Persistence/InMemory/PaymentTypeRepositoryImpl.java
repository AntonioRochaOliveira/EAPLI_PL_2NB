/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.PaymentType;
import Persistence.IPaymentTypeRepository;
import java.util.ArrayList;
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
		list = new ArrayList<PaymentType>();
                PaymentType check = new PaymentType("Check");
                check.addAditionalInformationName("Number","Integer");
                
                PaymentType credit = new PaymentType("Credit card");
                credit.addAditionalInformationName("Bank","String");
                credit.addAditionalInformationName("Number","Integer");
                credit.addAditionalInformationName("Validation Date","Date");
                
                PaymentType debit = new PaymentType("Debit Card");
                debit.addAditionalInformationName("Bank","String");
                debit.addAditionalInformationName("Number","Integer");
                debit.addAditionalInformationName("Validation","Date");
                
                list.add(debit);
                list.add(credit);
                list.add(check);
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
    public List<PaymentType> all() {
       return list;
    }
}
