/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.PaymentType;
import Persistence.IPaymentTypeRepository;
import Persistence.InMemory.ExpenseRepositoryImpl;
import Persistence.PersistenceFactory;
import Persistence.RepositoryFactory;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseBootstrapper {

    /**
     *
     */
        public ExpenseBootstrapper(){
        ExpenseRepositoryImpl repo = new ExpenseRepositoryImpl();
        /*
         repo.save(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4)));
         repo.save(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4)));
         repo.save(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4)));
         repo.save(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0)));
         * 
         */
        
        //Add Payment Types to Aplication for inicial use and testing
        //These values should be defined by the system administrator
        
        RepositoryFactory repFac = PersistenceFactory.buildPersistenceFactory();
        IPaymentTypeRepository paymentTypeRep = repFac.buildPaymentTypeRepository();
        if (paymentTypeRep.findAll().size()==0)
        {
        PaymentType check = new PaymentType("Check");
        check.addAditionalInformationName("Number", "Integer");
        
        PaymentType credit = new PaymentType("Credit card");
        credit.addAditionalInformationName("Bank", "String");
        credit.addAditionalInformationName("Number", "Integer");
        credit.addAditionalInformationName("Validation Date", "Date");
        
        PaymentType debit = new PaymentType("Debit Card");
        debit.addAditionalInformationName("Bank", "String");
        debit.addAditionalInformationName("Number", "Integer");
        debit.addAditionalInformationName("Validation", "Date");
       
        PaymentType money = new PaymentType("Money");
       
        paymentTypeRep.save(check);
        paymentTypeRep.save(credit);
        paymentTypeRep.save(debit);
        paymentTypeRep.save(money);
        }
    }
}
