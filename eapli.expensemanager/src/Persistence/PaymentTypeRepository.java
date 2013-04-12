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
                
                PaymentType cash = new PaymentType("Cash");
                
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
                list.add(cash);
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
