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
import Model.Expense;
import eapli.util.Console;
import java.util.List;

public class MonthlyExpenseUI {

    MonthlyExpenseController controller;
    List<Expense> listExpense;

    public MonthlyExpenseUI() {

        controller = new MonthlyExpenseController();
        System.out.println("* * *  Monthly Expense  * * *\n");
        System.out.println("* * *  ***************  * * *\n");
        int mes;
        mes = Console.readInteger("What month:");
        float despesa=controller.getExpensesMonth(mes);
//Este array list deve ser criado no controler  MonthlyExpense
//        listExpense = new ArrayList<Expense>();
//        ;
        System.out.println("Despesas do mes %d "+mes+"despesas do mes total %f"+despesa);
    }

  
   
    int option = Console.readInteger("Please choose a option");
}
