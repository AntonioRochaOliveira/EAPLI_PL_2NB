/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author João
 */
import Controllers.MonthlyExpenseController;
import Controllers.RegisterPayModeController;
import Model.Expense;
import eapli.util.Console;
import java.util.List;

public class MonthlyExpenseUI {

    
    List<Expense> listExpense;

    public MonthlyExpenseUI() {

        MonthlyExpenseController controller = new MonthlyExpenseController();

        System.out.println("* * *  Monthly Expense  * * *\n");
        System.out.println("* * *  ***************  * * *\n");
        int mes;
        mes = Console.readInteger("What month:");
        float despesa = controller.getExpensesMonth(mes);
        
    //Este arraylist deve ser criado no controler  MonthlyExpense
    //        listExpense = new ArrayList<Expense>();
    //        ;
        System.out.println("Despesas do mes " + mes + " despesas do mes total" + despesa);
    }
    
}
