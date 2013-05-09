/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import java.util.ArrayList;
import java.util.List;

import Model.Expense;
import Persistence.IExpenseRepository;

/**
 *
 * @author Márcio
 */
public class ExpenseRepositoryImpl implements IExpenseRepository {

    private static ExpenseRepositoryImpl instance = null;
    private static List<Expense> listExpense;

    public static synchronized ExpenseRepositoryImpl getInstance() {

        if (instance == null) {
            instance = new ExpenseRepositoryImpl();
        }

        return instance;
    }

    public ExpenseRepositoryImpl() {
        listExpense = new ArrayList<Expense>();
    }

    @Override
    public List<Expense> getListExpense() {
        return listExpense;
    }

    @Override
    public Expense save(Expense exp) {
        if (exp == null) {
            throw new IllegalArgumentException();
        }
        getListExpense().add(exp);
        return exp;
    }
}
