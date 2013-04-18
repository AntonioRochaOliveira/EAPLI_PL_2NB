/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.PayMode;
import Model.TypeOfExpense;
import Model.CheckingAccount;
import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
import java.util.List;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController extends BaseController {

    public ExpenseRegisterController() {
    }

    public void registerExpense(BigDecimal amount,TypeOfExpense type, Date date, PayMode payM,String comment) {
        Expense expense = new Expense(amount,type,date,payM,comment);
        ExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
//        ExpensesManagement em = new ExpensesManagement();
//        System.out.println("Gasto Semanal: " + em.getWeeklyExpense().toString());                     
    
    }
    
   @Override
   public CheckingAccount buildCheckingAccount() {
		return new CheckingAccount();	
	}
   
    public List<TypeOfExpense> getExpenseTypes()
    {
        return new TypeOfExpenseRepository().getListTExpense();    
    }
}
