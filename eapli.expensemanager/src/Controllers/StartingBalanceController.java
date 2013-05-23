package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;
import Persistence.CheckingAccountRepository;
import Persistence.PersistenceFactory;

public class StartingBalanceController extends BaseController{
    public StartingBalanceController()
    {
    }
    
    public void Save(BigDecimal amount)
    {
        CheckingAccount account = new CheckingAccount();
        account.setValue(amount);
        CheckingAccountRepository CheckAccRepo = PersistenceFactory.buildPersistenceFactory().buildCheckingAccountRepository();
        CheckAccRepo.save(account);
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
