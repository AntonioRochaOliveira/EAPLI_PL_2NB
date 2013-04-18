package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;

public abstract class BaseController {

	public abstract CheckingAccount buildCheckingAccount();
	
	public BigDecimal getBalance() {
		
		//TODO: alterar para return account.getBalance() 
		//assim que o .getBAlance retornar um BigDecimal.
		return new BigDecimal( buildCheckingAccount().getBalance() );
	}

}
