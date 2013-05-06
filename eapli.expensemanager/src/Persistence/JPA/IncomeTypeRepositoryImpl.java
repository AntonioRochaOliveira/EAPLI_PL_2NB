package Persistence.JPA;

import java.util.List;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

public class IncomeTypeRepositoryImpl implements IncomeTypeRepository {

	JpaRepository<IncomeType, String> util;
	
	public IncomeTypeRepositoryImpl(){
		util = new JpaRepository<IncomeType, String>();
	}
	
	@Override
	public void save(IncomeType incomeType) {
		if(incomeType.getName() == null || incomeType.getName().trim().length() == 0){
			throw new IllegalArgumentException();
		}
		incomeType = util.save(incomeType);
	}

	@Override
	public List<IncomeType> getIncomeTypes() {
		return util.all();
	}

}
