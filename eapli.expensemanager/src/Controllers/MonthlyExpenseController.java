package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import Model.Expense;
import Model.TypeOfExpense;

import java.util.Date;
import Persistence.*;
import java.math.BigDecimal;
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
        expenses = repo.getListExpense();
        Accounting b = new Accounting();
        //b.groupByMonth(mes);//conta corrente vai tratar do filtro de despesas por mes
    }
 
    public float getExpensesMonth(int mes){
        ExpenseRepository repository=new ExpenseRepository();
      
        BigDecimal amount;
        float sum=0.0f;
        Expense expense;
        Date data;
        
        List<Expense> listExpense=repository.getListExpense();
        
        for(int i=0;i<listExpense.size(); i++){
       
            expense=(Expense)listExpense.get(i);
            amount=expense.getAmount();
            data=expense.getDate();
            int m = data.getMonth();
         
            if(m==mes)
                sum+=amount.floatValue();

        
        }
        return sum;
    }
    
    
}