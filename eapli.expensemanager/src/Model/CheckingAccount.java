/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.IExpenseRepository;
import java.math.BigDecimal;
import java.util.List;

import Persistence.IncomeRepository;
import Persistence.StartingBalanceRepository;
import Persistence.InMemory.ExpenseRepositoryImpl;
import Persistence.PersistenceFactory;
import eapli.util.DateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author joel
 */
public class CheckingAccount {
    BigDecimal saldoI;
    IncomeRepository incomeRepo;
    IExpenseRepository expenseRepo;

    public CheckingAccount() {
        incomeRepo = PersistenceFactory.buildPersistenceFactory().buildIncomeRepository();
        expenseRepo = PersistenceFactory.buildPersistenceFactory().iexpenseRepository();
        saldoI = new BigDecimal(0);
    }
    //Methods

    public BigDecimal getBalance() {

        BigDecimal expenses, incomes;

        //Calculate total expenses in Expenses repository
        expenses = getExpensesTotal();

        //Calculate total incomes in Income repository
        incomes = getIncomesTotal();

        //Return balance
        incomes = incomes.subtract(expenses);
        return (incomes);
    }

    public BigDecimal getExpensesTotal() {


        BigDecimal sum = new BigDecimal(0);
        Expense expense;
        BigDecimal amount;

        //Get all expenses from ExpensesRepository
        List<Expense> listExpense = ExpenseRepositoryImpl.getInstance().getListExpense();

        for (int i = 0; i < listExpense.size(); i++) {

            expense = (Expense) listExpense.get(i);
            amount = expense.getAmount();
            sum = sum.add(amount);
        }

        return sum;
    }

    public BigDecimal getIncomesTotal() {

        BigDecimal sum = new BigDecimal(0);
        Income income;
        BigDecimal amount;

        //Get all incomes from IncomesRepository
        List<Income> listIncome = incomeRepo.getListIncome();

        for (int i = 0; i < listIncome.size(); i++) {

            income = listIncome.get(i);
            amount = income.getAmount();
            sum = sum.add(amount);
        }

        //Gets the initial Balance
        amount = getValue();
        sum = sum.add(amount);

        return sum;
    }
    
    public BigDecimal getWeeklyExpense() {
        Calendar today = Calendar.getInstance();
        Date todayDate = today.getTime();

        BigDecimal weekExpense = BigDecimal.ZERO;

        for (Expense e : ExpenseRepositoryImpl.getInstance().getListExpense()) {
            if (DateTime.getDateDiff(e.getDate(), todayDate, TimeUnit.DAYS) < 8) {
                weekExpense = weekExpense.add(e.getAmount());
            }

        }

        return weekExpense;
    }

    //Sets the inicial balance
    public void setValue(BigDecimal inicial) {
        saldoI = inicial;
    }

    //Gets the initial balance
    public BigDecimal getValue() {
        return saldoI;
    }

    public void add(Income income) {
        incomeRepo.save(income);
    }

    public void add(Expense expense) {
        expenseRepo.save(expense);
    }
}
