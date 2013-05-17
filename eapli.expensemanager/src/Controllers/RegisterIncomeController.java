/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import Model.CheckingAccount;
import Model.Income;
import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import java.util.ArrayList;
import Persistence.PersistenceFactory;


/**
 *
 * @author Joel Ferreira | jverde
 */
public class RegisterIncomeController extends BaseController {

    IncomeTypeRepository incomeTypeRepository;
    
    public RegisterIncomeController() {
    	incomeTypeRepository = PersistenceFactory.buildPersistenceFactory().buildIncomeTypeRepository();
    }
    
    public List<IncomeType> getIncomeTypes(){
        
        return PersistenceFactory.buildPersistenceFactory().buildIncomeTypeRepository().getIncomeTypes();
    }
    
    public void createIncome(BigDecimal amount, IncomeType incomeType, String what, Date date) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.add(new Income(amount, incomeType, what, date));
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
