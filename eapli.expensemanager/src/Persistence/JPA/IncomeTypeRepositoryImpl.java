package Persistence.JPA;

import java.util.List;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

public class IncomeTypeRepositoryImpl extends JpaRepository<IncomeType, Integer>  implements IncomeTypeRepository {

	@Override
	public void saveIncomeType(IncomeType incomeType) {
		if(incomeType.getName() == null || incomeType.getName().trim().length() == 0){
			throw new IllegalArgumentException();
		}
		incomeType = save(incomeType);
	}

	@Override
	public List<IncomeType> getIncomeTypes() {
		return all();
	}

}
