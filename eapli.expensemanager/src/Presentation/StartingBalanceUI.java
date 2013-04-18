/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.StartingBalanceController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class StartingBalanceUI extends BaseUI{
    StartingBalanceController controller;
    public StartingBalanceUI()
    {
    }
    
    public void mainLoop() {
        System.out.println("\n* * *  STARTING BALANCE  * * *\n");
        controller = new StartingBalanceController();
        displayBalance();
        System.out.println("Current starting balance: "+ controller.getValue().toString());
        double value = Console.readDouble("\n Amount:");

        BigDecimal amount = new BigDecimal(value);
        controller.setValue(amount);
    }
    
    /**
     *
     * @return
     */
    @Override
	public BaseController buildBaseController() {
		return controller;
	}
}
