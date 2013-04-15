package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;

public class BaseController {

	CheckingAccount account;
	
	public BaseController(CheckingAccount account){
		this.account = account;		
	}
	
	public BigDecimal getBalance() {
		
		//TODO: alterar para return account.getBalance() 
		//assim que o .getBAlance retornar um BigDecimal.
		return new BigDecimal( account.getBalance() );
	}
		
}
