/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.*;
import java.util.List;
/**
 *
 * @author losa
 */
public interface IExpenseRepository {
  /**
     * @return the listExpense
     */
    public List<Expense> getListExpense();
    public void save(Expense exp);       
}
