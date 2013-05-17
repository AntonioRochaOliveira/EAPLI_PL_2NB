/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.List;

import Model.Income;

/**
 *
 * @author jverde | Joel Frreira
 */
public interface IncomeRepository {
    
    public Income save(Income income);
    public List<Income> getListIncome();
}
