/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import Model.Income;
import Model.IncomeType;
import Persistence.IncomeRepository;
import Persistence.IncomeTypeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Joel Ferreira
 */
public class RegisterIncomeController {

    IncomeTypeRepository incomeTypeRepository;
    
    public RegisterIncomeController() {
    }
    
    public List getIncomesType(){
        
        return incomeTypeRepository.getIncomeType();
    }
    
    public void createIncome(BigDecimal amount, IncomeType incomeType, String what, Date date) {
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.createIncome(amount, incomeType, what, date);
    }
}
