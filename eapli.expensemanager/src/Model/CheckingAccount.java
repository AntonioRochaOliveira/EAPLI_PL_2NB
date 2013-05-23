/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import Persistence.IExpenseRepository;
import Persistence.IncomeRepository;
import Persistence.PersistenceFactory;
import Persistence.InMemory.ExpenseRepositoryImpl;
import eapli.util.DateTime;
import java.util.Iterator;

/**
 *
 * @author joel
 */
@Entity
public class CheckingAccount {
    @Id
    int id=1;
    @Column(name="saldoinicial")
    BigDecimal saldoI;
    @Transient
    IncomeRepository incomeRepo;
    @Transient
    IExpenseRepository expenseRepo;

    public CheckingAccount() {
        incomeRepo = PersistenceFactory.buildPersistenceFactory().buildIncomeRepository();
        expenseRepo = PersistenceFactory.buildPersistenceFactory().iexpenseRepository();
        saldoI = PersistenceFactory.buildPersistenceFactory().buildCheckingAccountRepository().getValue();
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

    public BigDecimal getLastSevenDaysExpense() {
        Calendar now = Calendar.getInstance();
        Date today = now.getTime();

        BigDecimal last7DaysExpense = BigDecimal.ZERO;
        for (Iterator<Expense> it = expenseRepo.getListExpense().iterator(); it.hasNext();) {
            Expense e = it.next();
            if (DateTime.getDateDiff(e.getDate(), today, TimeUnit.DAYS) < 8) {
                last7DaysExpense = last7DaysExpense.add(e.getAmount());
            }
        }

        return last7DaysExpense;
    }

    public BigDecimal getWeeklyExpense() {
        Calendar now = Calendar.getInstance();
        now.setFirstDayOfWeek(1); //Início da semana SEGUNDA

        Date today = now.getTime();


        BigDecimal weeklyExpense = BigDecimal.ZERO;
        for (Iterator<Expense> it = expenseRepo.getListExpense().iterator(); it.hasNext();) {
            Expense e = it.next();

            if (DateTime.getDateDiff(e.getDate(), today, TimeUnit.DAYS) < 8) {
                weeklyExpense = weeklyExpense.add(e.getAmount());
            }
        }

        return weeklyExpense;

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
        incomeRepo.saveIncome(income);
    }

    public void add(Expense expense) {
        expenseRepo.save(expense);
    }
}
