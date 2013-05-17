/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import Model.CheckingAccount;
import Model.Expense;
import Model.PayMode;
import Model.TypeOfExpense;
import Persistence.IExpenseRepository;
import Persistence.PersistenceFactory;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController extends BaseController {

    public ExpenseRegisterController() {
    }

    public void registerExpense(BigDecimal amount,TypeOfExpense type, Date date, PayMode payM,String comment) {
        Expense expense = new Expense(amount,type,date,payM,comment);
        IExpenseRepository repo = PersistenceFactory.buildPersistenceFactory().iexpenseRepository();
        repo.save(expense);
//        ExpensesManagement em = new ExpensesManagement();
//        System.out.println("Gasto Semanal: " + em.getWeeklyExpense().toString());                     
    
    }
    
   @Override
   public CheckingAccount buildCheckingAccount() {
		return new CheckingAccount();	
	}
   
    public List<Expense> getExpenses()
    {
        return PersistenceFactory.buildPersistenceFactory().iexpenseRepository().getListExpense();
    }
    public List<TypeOfExpense> getRTypeOfExpenses()
    {
        return PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository().getListTExpense();
    }
}