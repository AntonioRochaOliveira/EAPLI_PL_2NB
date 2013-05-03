/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;
import Persistence.IExpenseRepository;
import java.util.List;


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
