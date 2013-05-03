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
import Persistence.InMemory.ExpenseRepositoryImpl;
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
        ExpenseRepositoryImpl repo = new ExpenseRepositoryImpl();
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
 //       TypeOfExpenseRepository repo = PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository();
return PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository().getListTExpense();
 //       return new PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository().getListTExpense();    
    }
}
