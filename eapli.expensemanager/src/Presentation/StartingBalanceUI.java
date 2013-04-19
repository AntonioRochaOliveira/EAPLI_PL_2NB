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
        controller = new StartingBalanceController();
    }
    
    public double mainLoop() {
        //System.out.println("\n* * *  STARTING BALANCE  * * *\n");
        //controller = new StartingBalanceController();
        /*displayBalance();
        System.out.println("Current starting balance: "+ controller.getValue().toString());
        return Console.readDouble("\n Amount:");

        BigDecimal amount = new BigDecimal(value);
        controller.setValue(amount);*/
        return Console.readDouble("\n Amount:");
    }
    
    /**
     *
     * @return
     */
    @Override
    public BaseController buildBaseController() {
	return controller;
    }
    
    @Override
    public String getTitle() {
	return  "STARTING BALANCE UI";
    }

    @Override
    public void showContent() {
        double value = mainLoop();
	BigDecimal amount = new BigDecimal(value);
        controller.setValue(amount);
	System.out.println("New Income Type Recorded.");
    }
}
