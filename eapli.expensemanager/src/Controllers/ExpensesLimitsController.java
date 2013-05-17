/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;
import Model.Expense;
import Model.ExpensesLimits;
import Model.PayMode;
import Model.TypeOfExpense;
import Persistence.IExpenseRepository;
import Persistence.IExpensesLimitsRepository;
import Persistence.PersistenceFactory;
import java.util.Date;

/**
 *
 * @author Paulo Mendes
 * @author Sérgio Castro
 */
public class ExpensesLimitsController extends BaseController {

    IExpensesLimitsRepository expensesLimitsRepository;

    public ExpensesLimitsController() {
        expensesLimitsRepository = PersistenceFactory.buildPersistenceFactory().buildExpensesLimitsRepository();
    }

    public BigDecimal getWeeklyLimit() {
        return PersistenceFactory.buildPersistenceFactory().buildExpensesLimitsRepository().getWeeklyLimit();
    }

    public void registerExpense(BigDecimal amount, TypeOfExpense type, Date date, PayMode payM, String comment) {
        Expense expense = new Expense(amount, type, date, payM, comment);
        IExpenseRepository repo = PersistenceFactory.buildPersistenceFactory().iexpenseRepository();
        repo.save(expense);
//        ExpensesManagement em = new ExpensesManagement();
//        System.out.println("Gasto Semanal: " + em.getWeeklyExpense().toString());                     

    }

    public void setWeeklyLimit(BigDecimal newWeeklyLimit) {
        ExpensesLimits expensesLimits = new ExpensesLimits("weekly", newWeeklyLimit);
        IExpensesLimitsRepository repo = PersistenceFactory.buildPersistenceFactory().buildExpensesLimitsRepository();
        repo.save(expensesLimits);
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
