/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        
        //comentei chamada ao metodo .registerExpense porque não corresponde á declaração:
        //Bruno Flávio:
        //controller.registerExpense(what, date, amount);
        System.err.println("ExpenseRegisterUI.java:31!! Ver comentário.");
        
        System.out.println("expense recorded.");
    }
}
