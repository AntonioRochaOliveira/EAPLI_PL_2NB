/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author João Silva
 */
import java.math.BigDecimal;

import Controllers.BaseController;
import Controllers.WeeklyExpenseController;

public class WeeklyExpenseUI extends BaseUI {

    private WeeklyExpenseController controller;

    public WeeklyExpenseUI() {

        controller = new WeeklyExpenseController();
    }

    @Override
    public String getTitle() {

        return "*Weekly Expense  ";
    }

    @Override
    public void showContent() {
        BigDecimal weekExpense = controller.getWeeklyExpense();

        System.out.println("Despesa Semanal: " + weekExpense);
    }

    @Override
    public BaseController buildBaseController() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
