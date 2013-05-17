package Persistence.InMemory;

import java.util.ArrayList;
import java.util.List;

import javax.sql.rowset.spi.SyncResolver;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;

public class IncomeTypeRepositoryImpl implements IncomeTypeRepository{
	private static IncomeTypeRepository instance = null; 
	
	private List<IncomeType> list;
	
	private IncomeTypeRepositoryImpl(){
		list = new ArrayList<IncomeType>();
	}
	
	public static synchronized IncomeTypeRepository getInstance(){
		if(instance == null){
			instance = new IncomeTypeRepositoryImpl();
		}
		return instance;
	}

	public void saveIncomeType(IncomeType incomeType) {
		list.add(incomeType);
	}
      
    public List<IncomeType> getIncomeTypes() {
        return list;
    }
	
}
