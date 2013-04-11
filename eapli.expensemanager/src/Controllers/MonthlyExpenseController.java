package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.Expense;

import java.util.Date;
import Persistence.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Mak3r
 */
public class MonthlyExpenseController {
    
    public MonthlyExpenseController(){
        
    }
    
    public void expensesList(int mes){
        
        List<Expense> expenses = new ArrayList<Expense>();
        ExpenseRepository repo = new ExpenseRepository();
        //expenses.getArrayList(repo); criar get da lista de despesas
        //ValuesCalculator b = new ValuesCalculator();
        //b.groupByMonth(expenses, mes);//conta corrente vai tratar do filtro de despesas por mes
    }
    
}
