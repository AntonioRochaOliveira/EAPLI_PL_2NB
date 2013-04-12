/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.StartingBalanceController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class StartingBalanceUI {
    public StartingBalanceUI()
    {
    }
    
    public void mainLoop() {
        System.out.println("\n* * *  STARTING BALANCE  * * *\n");
        StartingBalanceController controller = new StartingBalanceController();
        System.out.println("Current starting balance: "+ controller.getValue().toString());
        double value = Console.readDouble("\n Amount:");

        BigDecimal amount = new BigDecimal(value);
        controller.setValue(amount);
    }
}
