package Persistence.InMemory;

import java.util.ArrayList;
import java.util.List;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

public class IncomeTypeRepositoryImpl implements IncomeTypeRepository{
	
	private List<IncomeType> list;
	
	public IncomeTypeRepositoryImpl(){
		list = new ArrayList<IncomeType>();
	}

	public void save(IncomeType incomeType) {
		list.add(incomeType);
	}
      
    public List<IncomeType> getIncomeTypes() {
        return list;
    }
	
}
