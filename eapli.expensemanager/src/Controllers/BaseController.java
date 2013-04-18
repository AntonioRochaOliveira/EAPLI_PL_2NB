package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;

public abstract class BaseController {

	public abstract CheckingAccount buildCheckingAccount();
	
	public BigDecimal getBalance() {
		
		return buildCheckingAccount().getBalance();
<<<<<<< HEAD
<<<<<<< HEAD
	}
	
	public BigDecimal getWeeklyExpense(){
		return buildCheckingAccount().getWeeklyExpense();
=======
		
>>>>>>> branch 'master' of git@github.com:AntonioRochaOliveira/EAPLI_PL_2NB.git
=======
		
>>>>>>> branch 'master' of git@github.com:AntonioRochaOliveira/EAPLI_PL_2NB.git
	}

}
