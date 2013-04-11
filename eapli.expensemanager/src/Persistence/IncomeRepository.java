/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Income;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jverde
 */
public class IncomeRepository {

    private List<Income> list;

    public IncomeRepository() {
        list = new ArrayList<Income>();
    }

    public void save(Income income) {
        list.add(income);
    }
    
    public List<Income> getIncomes(){
    	return list;
    }
}
