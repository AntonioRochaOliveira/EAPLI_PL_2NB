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

    public ExpenseRepository() {
    }

    public void save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        listExpense.add(exp);

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

    }
}
