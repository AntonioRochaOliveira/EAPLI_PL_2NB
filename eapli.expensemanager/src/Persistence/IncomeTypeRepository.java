package Persistence;

import java.util.ArrayList;
import java.util.List;

import Model.IncomeType;

public class IncomeTypeRepository {
	
	private static IncomeTypeRepository instance = null;
	
	private List<IncomeType> list;

	public static synchronized IncomeTypeRepository getInstance() {
		
		if (instance == null)
			instance = new IncomeTypeRepository();
		
		return instance;
	}
	
	private IncomeTypeRepository(){
		list = new ArrayList<IncomeType>();
	}

	public void save(IncomeType incomeType) {
		list.add(incomeType);
	}
      
        public List getIncomeType() {
                return list;
        }
	
}
