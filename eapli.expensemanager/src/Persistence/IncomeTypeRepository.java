package Persistence;

import java.util.ArrayList;
import java.util.List;

import Model.IncomeType;

public class IncomeTypeRepository {
	private List<IncomeType> list;

	public IncomeTypeRepository(){
		list = new ArrayList<IncomeType>();
	}

	public void save(IncomeType incomeType) {
		list.add(incomeType);
	}
	
}
