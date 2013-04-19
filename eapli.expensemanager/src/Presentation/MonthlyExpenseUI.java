/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author João Silva
 */
import Controllers.BaseController;
import Controllers.MonthlyExpenseController;
import Controllers.RegisterPayModeController;
import Model.Expense;
import eapli.util.Console;
import java.util.List;

public class MonthlyExpenseUI extends BaseUI {

    MonthlyExpenseController controller;
    List<Expense> listExpense;

    public MonthlyExpenseUI() {

        controller = new MonthlyExpenseController();
    }

    public String getTitle() {

        return "*Monthly Expense  ";
    }

    @Override
    public void showContent() {

        System.out.println("* * *  REGISTER A PAYMENT MODE  * * *\n");
        int mes;
        mes = Console.readInteger("What month:");
        float despesa = controller.getExpensesMonth(mes);
        System.out.println("Month Expense:  " + mes + " Total: " + despesa);
    }

    @Override
    public BaseController buildBaseController() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
