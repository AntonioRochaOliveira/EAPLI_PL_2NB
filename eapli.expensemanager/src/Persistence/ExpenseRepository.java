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

    private static List<Expense> listExpense = new ArrayList<Expense>();

    /**
     * @return the listExpense
     */
    public static List<Expense> getListExpense() {
        return listExpense;
    }

    public ExpenseRepository() {
    }

    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        getListExpense().add(exp);

    }
    // class member
    private static List<TypeOfExpense> listTExpense = new ArrayList<TypeOfExpense>();

    /**
     * @return the listTExpense
     */
    public static List<TypeOfExpense> getListTExpense() {
        return listTExpense;
    }

    public void save(TypeOfExpense Texp) {
        if (Texp == null) {
            throw new IllegalArgumentException();
        }
        getListTExpense().add(Texp);

<<<<<<< HEAD
    }
    
    public static List<Expense> getListExpense() {
        return listExpense;
=======
>>>>>>> 9292ff9c82c66c0ae68f565702e46b7769af1b3f
    }
}
