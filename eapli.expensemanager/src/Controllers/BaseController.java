package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;

public abstract class BaseController {

	public CheckingAccount buildCheckingAccount(){
		return new CheckingAccount();
	}
	
	public BigDecimal getBalance() {
		
		return buildCheckingAccount().getBalance();

	}
        
        public BigDecimal getWeeklyExpense() {
            return buildCheckingAccount().getWeeklyExpense();
        }
        
        
		
}
