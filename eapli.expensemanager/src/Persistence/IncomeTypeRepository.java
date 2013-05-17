package Persistence;

import java.util.List;

import Model.IncomeType;

public interface IncomeTypeRepository {
	public void saveIncomeType(IncomeType incomeType);
    public List<IncomeType> getIncomeTypes() ;	
}
