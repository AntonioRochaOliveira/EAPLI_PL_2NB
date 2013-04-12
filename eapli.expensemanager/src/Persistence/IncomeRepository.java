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

    private static List<Income> listIncome=new ArrayList<Income>();

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
