/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author  Paulo Mendes
 * @author  Sérgio Castro
 */

import Controllers.BaseController;
import Controllers.WeeklyExpenseController;
import java.math.BigDecimal;

public class WeeklyExpenseUI extends BaseUI {

    private WeeklyExpenseController controller = null;

    public WeeklyExpenseUI() {

        controller = new WeeklyExpenseController();
    }

    @Override
    public String getTitle() {

        return "  Weekly Expense  ";
    }

    @Override
    public void showContent() {
        
        BigDecimal weeklyExpense = controller.getWeeklyExpense();

        System.out.println("Despesa Semanal: " + weeklyExpense);
        
    }

    @Override
    public BaseController buildBaseController() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return controller;
    }
}
