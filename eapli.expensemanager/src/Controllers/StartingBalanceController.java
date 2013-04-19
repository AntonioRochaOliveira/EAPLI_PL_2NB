package Controllers;

import Model.CheckingAccount;
import java.math.BigDecimal;

public class StartingBalanceController extends BaseController{
    public StartingBalanceController()
    {
    }
    
    public void setValue(BigDecimal amount)
    {
        CheckingAccount account = new CheckingAccount();
        account.setValue(amount);
    }
    
    public BigDecimal getValue()
    {
        CheckingAccount account = new CheckingAccount();
        return account.getValue();
    }
    
    @Override
    public CheckingAccount buildCheckingAccount() {
		return new CheckingAccount();	
	}
}
