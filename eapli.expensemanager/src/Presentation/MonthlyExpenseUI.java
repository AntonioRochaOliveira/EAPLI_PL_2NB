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
import eapli.util.Console;

public class MonthlyExpenseUI extends BaseUI {

    MonthlyExpenseController controller = null;
   

    public MonthlyExpenseUI() {

        controller = new MonthlyExpenseController();
    }
    
    @Override
    public String getTitle() {

        return "*Monthly Expense  ";
    }

    @Override
    public void showContent() {
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
