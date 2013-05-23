/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.Income;
import Persistence.IncomeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel ferreira | jverde
 */

public class IncomeRepositoryImpl implements IncomeRepository {
    
    private static IncomeRepository instance = null;

    private static List<Income> listIncome;
    
    public static synchronized IncomeRepository getInstance() {
		
		if (instance == null)
			instance = new IncomeRepositoryImpl();
		
		return instance;
	}

    public IncomeRepositoryImpl() {
        listIncome = new ArrayList<Income>();
    }

    @Override
    public Income saveIncome(Income income) {
        if (income == null) {
                throw new IllegalArgumentException();
        }
        getListIncome().add(income);
        return income;
    }
    
    @Override
    public List<Income> getListIncome(){
        return listIncome;
    }
    
}
