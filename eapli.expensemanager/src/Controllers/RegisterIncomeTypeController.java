package Controllers;

import Model.CheckingAccount;
import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.PersistenceFactory;

public class RegisterIncomeTypeController extends BaseController{
	
	@Override
	public CheckingAccount buildCheckingAccount() {
		return new CheckingAccount();	
	}

	public void regIncomeType(String name, String description) {
		IncomeType incomeType = new IncomeType(name,description);
		IncomeTypeRepository repo = PersistenceFactory.buildPersistenceFactory().buildIncomeTypeRepository();
		repo.save(incomeType);
	}
}
