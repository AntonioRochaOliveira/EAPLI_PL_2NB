/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.TypeOfExpenseController;
import eapli.util.Console;

/**
 *
 * @author Karlos
 */
public class TypeOfExpenseUI {
     public void mainLoop() {
        System.out.println("* * *  REGISTER A New TYPE OF EXPENSE  * * *\n");
        
        String desc = Console.readLine("Description:");
        
                
        TypeOfExpenseController controller = new TypeOfExpenseController();
        controller.TypeOfExpense(desc);
        
        
        System.out.println("Type of expense recorded.");
    }
}
