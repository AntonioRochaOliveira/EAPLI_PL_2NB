/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Model.Expense;
import Persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fábio Mendonça/Fernando Silva
 */
public class Accounting {
    
    public Accounting(){}
    
    //Methods
    public float getBalance(){
        
        float expenses, incomes;                 
        
        //Calculate total expenses in Expenses repository
        expenses=getExpensesTotal();       
        
        //Calculate total incomes in Income repository
        incomes=getIncomesTotal();
        
        //Return balance
        return (incomes-expenses);
    }
    
    public float getExpensesTotal(){
        
        //New Object ExpensesRepository
        ExpenseRepository repository=new ExpenseRepository();
        
        float sum=0.0f;
        Expense expense;
        BigDecimal amount;
        
        //Get all expenses from ExpensesRepository
        List<Expense> listExpense=repository.getExpenses();
        
        for(int i=0;i<listExpense.size(); i++){
            
            expense=(Expense)listExpense.get(i);
            amount=expense.getAmount();
            sum+=amount.floatValue();            
        }
        
        return sum;
    }
    
    public float getIncomesTotal(){
        
        //New Object IncomeRepository
        IncomeRepository repository=new IncomeRepository();
        
        float sum=0.0f;
        Expense expense;
        BigDecimal amount;
        
         //Get all incomes from IncomesRepository
        List<Income> listIncome=repository.getIncomes();
        
        for(int i=0;i<listIncome.size(); i++){
            
            expense=(Expense)listIncome.get(i);
            amount=expense.getAmount();
            sum+=amount.floatValue();            
        }
        
        //Gets the initial Balance
        amount=getValue();
        sum+=amount.floatValue();
        
        return sum;
    }
    
    //Sets the inicial balance
    public void setValue(BigDecimal inicial){

        StartingBalanceRepository balanceRepository= StartingBalanceRepository.instance();
        balanceRepository.setValue(inicial);
    }
    
    //Gets the initial balance
    public BigDecimal getValue(){
        
        StartingBalanceRepository balanceRepository= StartingBalanceRepository.instance();
        
        return balanceRepository.getValue();
    }
}
