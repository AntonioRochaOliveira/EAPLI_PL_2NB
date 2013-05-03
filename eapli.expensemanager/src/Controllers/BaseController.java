package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;

public abstract class BaseController {

	public abstract CheckingAccount buildCheckingAccount();
	
	public BigDecimal getBalance() {
		
		return buildCheckingAccount().getBalance();

	}
		
}
