/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author losa
 */
public class ExpenseRepository implements IExpenseRepository {
    // class member
    private static ExpenseRepository instance = null;
    private static List<Expense> listExpense;

    public static synchronized ExpenseRepository getInstance() {
		
		if (instance == null)
			instance = new ExpenseRepository();
		
		return instance;
    }
    
    public ExpenseRepository()
    {
        listExpense = new ArrayList<Expense>();
    }
    /**
     * @return the listExpense
     */
    public static List<Expense> getListExpense() {
        return listExpense;
    }

    

    @Override
    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        getListExpense().add(exp);

    }    
}
