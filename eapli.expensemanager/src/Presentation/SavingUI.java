/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.SavingController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author João
 */
public class SavingUI extends BaseUI{

    private SavingController controller;
    
    public SavingUI(){
        controller = new SavingController();
        showContent();
    }
    
    @Override
    public void showContent() {
        //throw new UnsupportedOperationException("Not supported yet.");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        String description = Console.readLine("Description:");
        
        controller.registerSaving(amount, description);
        
        System.out.println("Savings registered.");
    }

    @Override
    public BaseController buildBaseController() {
        return controller;
    }
    
    
}
