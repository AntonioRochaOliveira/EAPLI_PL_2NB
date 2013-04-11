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

import Model.IncomeType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MonthlyExpenseUI {

    MonthlyExpenseController controller;
    List<Expense> listExpense;

    public MonthlyExpenseUI() {

        controller = new MonthlyExpenseController();
        System.out.println("* * *  Monthly Expense  * * *\n");
        System.out.println("* * *  ***************  * * *\n");    
             

//Este array list deve ser criado no controler  MonthlyExpense
//        listExpense = new ArrayList<Expense>();
//        ;
    }

    private Date readDate() {
        return Console.readDate("When:");
    }
    int option = Console.readInteger("Please choose a option");
}
    
