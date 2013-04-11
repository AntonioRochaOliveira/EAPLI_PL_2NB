/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Model.Expense;
import Model.Income;
import Persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Fábio Mendonça/Fernando Silva
 */
public class Accounting {
    
    public Accounting(){}
    
    //Methods
    public void viewBalance() {       
        System.out.println("\n\t O Seu Salto é : " + getBalance()+"€\n");        
    }
    
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
        
      
        float sum=0.0f;
        Expense expense;
        BigDecimal amount;
        
        //Get all expenses from ExpensesRepository
        List<Expense> listExpense=ExpenseRepository.getListExpense();
        
        for(int i=0;i<listExpense.size(); i++){
            
            expense=(Expense)listExpense.get(i);
            amount=expense.getAmount();
            sum+=amount.floatValue();            
        }
        
        return sum;
    }
    
    public float getIncomesTotal(){
        float sum=0.0f;
        Income income;
        BigDecimal amount;
        
         //Get all incomes from IncomesRepository
        List<Income> listIncome=IncomeRepository.getListIncome();
        
        for(int i=0;i<listIncome.size(); i++){
            
            income=(Income)listIncome.get(i);
            amount=income.getAmount();
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
