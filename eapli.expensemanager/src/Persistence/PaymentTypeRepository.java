/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.ArrayList;
import java.util.List;

import Model.PaymentType;

/**
 *
 * @author xiko
 */
public class PaymentTypeRepository implements IPaymentTypeRepository {
    private static PaymentTypeRepository instance = null;
	
	private List<PaymentType> list;

	public static synchronized PaymentTypeRepository getInstance() {
		
		if (instance == null)
			instance = new PaymentTypeRepository();
		
		return instance;
	}
	
	private PaymentTypeRepository(){
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
	public void save(PaymentType incomeType) {
		list.add(incomeType);
	}
      
        public List getPaymentType() {
                return list;
        }
}
