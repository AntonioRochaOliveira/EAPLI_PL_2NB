/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.PlacementSavingsController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class PlacementSavingsUI extends BaseUI{
    PlacementSavingsController controller;
    public PlacementSavingsUI()
    {
        controller = new PlacementSavingsController();
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
	return  "* * * PLACEMENT SAVINGS * * *";
    }

    @Override
    public void showContent() {
        double value = mainLoop();
	BigDecimal amount = new BigDecimal(value);
        //controller.setValue(amount);
        //SE ATINGIR VALOR PRINT PARABENS
        //ELSE
	System.out.println("New Placement Registered.");
    }
}
