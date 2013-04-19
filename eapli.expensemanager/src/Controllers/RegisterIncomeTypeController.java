package Controllers;

import Model.CheckingAccount;
import Model.IncomeType;
import Persistence.IncomeTypeRepository;

public class RegisterIncomeTypeController extends BaseController{
	
	@Override
	public CheckingAccount buildCheckingAccount() {
		return new CheckingAccount();	
	}

	public void regIncomeType(String name, String description) {
		IncomeType incomeType = new IncomeType(name,description);
		IncomeTypeRepository repo = IncomeTypeRepository.getInstance();
		repo.save(incomeType);
	}
}
