/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import java.util.List;

import Model.Expense;
/**
 *
 * @author losa
 */
public interface IExpenseRepository {
  /**
     * @return the listExpense
     */
    public List<Expense> getListExpense();
    public Expense save(Expense exp);       
}
