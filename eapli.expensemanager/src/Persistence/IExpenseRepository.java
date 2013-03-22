/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.*;
/**
 *
 * @author losa
 */
public interface IExpenseRepository {
    void save(Expense exp);
  //  List<Expense> getAllExpenses();        
}
