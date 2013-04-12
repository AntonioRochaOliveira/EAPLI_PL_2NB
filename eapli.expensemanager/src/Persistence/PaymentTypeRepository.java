/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xiko
 */
public class PaymentTypeRepository implements IPaymentRepository {
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
                credit.addAditionalInformationName("Creation Date","Date");
                
                PaymentType debit = new PaymentType("Debit Card");
                debit.addAditionalInformationName("Bank","String");
                debit.addAditionalInformationName("Number","Integer");
                debit.addAditionalInformationName("Creation Date","Date");
                
                list.add(debit);
                list.add(credit);
                list.add(check);
	}

         @Override
    public List<PaymentType> getAll() {
          return list;
          }

    @Override
    public void save(Object obj) {
        if (obj instanceof PaymentType)
        list.add((PaymentType)obj);
        else
              throw new IllegalArgumentException();
    }
}
