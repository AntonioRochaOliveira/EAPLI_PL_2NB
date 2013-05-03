package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Expense;
import Persistence.InMemory.ExpenseRepositoryImpl;
import eapli.util.DateTime;

import java.util.Date;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Paulo Mendes
 * @author Sérgio Castro
 */
public class WeeklyExpenseController {

    public WeeklyExpenseController() {
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
    
}