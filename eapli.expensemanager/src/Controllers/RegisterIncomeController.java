/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import Model.Income;
import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceFactory;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Joel Ferreira
 */
public class RegisterIncomeController extends BaseController {

    IncomeTypeRepository incomeTypeRepository;
    
    public RegisterIncomeController() {
    	incomeTypeRepository = PersistenceFactory.buildPersistenceFactory().buildIncomeTypeRepository();
    }
    
    public List<IncomeType> getIncomeTypes(){
        
        return incomeTypeRepository.getIncomeTypes();
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
