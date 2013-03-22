package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

public class RegisterIncomeTypeController {
	
	public RegisterIncomeTypeController(){
		
	}

	public void regIncomeType(String name, String description) {
		IncomeType incomeType = new IncomeType(name,description);
		IncomeTypeRepository repo = new IncomeTypeRepository();
		repo.save(incomeType);
	}
}
