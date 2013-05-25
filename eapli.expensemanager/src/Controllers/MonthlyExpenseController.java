package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import Model.Expense;
import Model.CheckingAccount;
//import Persistence.InMemory.ExpenseRepositoryImpl;

/**
 *
 * @author Mak3r
 */
public class MonthlyExpenseController {
    
    public MonthlyExpenseController(){
        
    }
    
    public float getExpensesMonth(int mes){
      
        BigDecimal amount;
        float sum=0.0f;
        Expense expense;
        Date data;
        CheckingAccount ca = new CheckingAccount();
        List <Expense> listMonthlyExpense = null;
        listMonthlyExpense = ca.getListExpense();
        
     
        for(Expense list : listMonthlyExpense){
          amount = list.getAmount();
          data= list.getDate();
          Calendar cal = Calendar.getInstance();
          cal.setTime(data);
          int m = cal.get(Calendar.MONTH);
         
          if(m==mes)
               sum+=amount.floatValue();

        
        }
        return sum;
    }
    
    
}