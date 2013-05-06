/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import java.util.List;

import Model.Expense;
import Persistence.IExpenseRepository;


/**
 *
 * @author Márcio
 */
public class ExpenseRepositoryImpl extends JpaRepository<Expense, String> implements IExpenseRepository{

    @Override
    public List<Expense> getListExpense() {
        return super.all();
    }    
    
}
