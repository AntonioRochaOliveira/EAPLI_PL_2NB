/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.math.BigDecimal;

import Controllers.BaseController;
import Controllers.StartingBalanceController;
import eapli.util.Console;


public class StartingBalanceUI extends BaseUI{
    StartingBalanceController controller;
    public StartingBalanceUI()
    {
        controller = new StartingBalanceController();
    }
    
    public double mainLoop() {
        return Console.readDouble("\n Amount:");
    }

    @Override
    public BaseController buildBaseController() {
	return controller;
    }
    
    @Override
    public String getTitle() {
	return  "* * * STARTING BALANCE * * *";
    }

    @Override
    public void showContent() {
        double value = mainLoop();
	BigDecimal amount = new BigDecimal(value);
        controller.setValue(amount);
	System.out.println("New Starting Balance Recorded.");
    }
}
