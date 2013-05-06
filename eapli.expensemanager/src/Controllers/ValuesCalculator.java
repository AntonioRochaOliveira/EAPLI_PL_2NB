/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.math.BigDecimal;

import Model.Expense;
import Persistence.IncomeRepository;
import Persistence.InMemory.ExpenseRepositoryImpl;
/**
 *
 * @author Fábio Mendonça/Fernando Silva
 */
public class ValuesCalculator {
    
    private static ValuesCalculator instance = null;
    
    protected ValuesCalculator(){}
    
    public static ValuesCalculator getInstance(){
        
        if(instance==null)
            instance=new ValuesCalculator();
            
        return instance;
    }
    
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
        ExpenseRepositoryImpl repository=new ExpenseRepositoryImpl();
        
        float sum=0.0f;
        Expense expense;
        BigDecimal amount;
        
        //Get all expenses from ExpensesRepository
//        List<Expense> listExpense=repository.getExpenses();
//        
//        for(int i=0;i<listExpense.size(); i++){
//            
//            expense=(Expense)listExpense.get(i);
//            amount=expense.getAmount();
//            sum+=amount.floatValue();            
//        }
        
        return sum;
    }
    
    public float getIncomesTotal(){
        
        //New Object IncomeRepository
        IncomeRepository repository=new IncomeRepository();
        
        float sum=0.0f;
        Expense expense;
        BigDecimal amount;
        
         //Get all incomes from IncomesRepository
//        List<Income> listIncome=repository.getIncomes();
//        
//        for(int i=0;i<listIncome.size(); i++){
//            
//            expense=(Expense)listIncome.get(i);
//            amount=expense.getAmount();
//            sum+=amount.floatValue();            
//        }
        
        return sum;
    }
}
