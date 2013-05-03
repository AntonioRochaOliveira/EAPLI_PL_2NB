/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.ArrayList;
import java.util.List;

import Model.Income;

/**
 *
 * @author jverde
 */
public class IncomeRepository {
    
    private static IncomeRepository instance = null;

    private static List<Income> listIncome;
    
    public static synchronized IncomeRepository getInstance() {
		
		if (instance == null)
			instance = new IncomeRepository();
		
		return instance;
	}

    public IncomeRepository() {
        listIncome = new ArrayList<Income>();
    }

    public void save(Income income) {
        if (income == null) {
                throw new IllegalArgumentException();
        }
        getListIncome().add(income);
    }
    
    public static List<Income> getListIncome(){
        return listIncome;
    }
    
}
