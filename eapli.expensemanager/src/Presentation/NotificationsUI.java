/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.NotificationsController;
import eapli.util.Console;
import java.math.BigDecimal;


/**
 *
 * @author sdcastro
 */
public class NotificationsUI extends BaseUI {

    private NotificationsController controller = null;
    
    public void showSubmenu() {
        
        controller = new NotificationsController();
        showContent();        
    }
   
    

    @Override
    public void showContent() {

        String weeklyLimitText;
        BigDecimal weekLimit = controller.getWeekLimit();
        
        if (weekLimit.compareTo(BigDecimal.ZERO) == 0) {
            weeklyLimitText = " [NOT SET]";
        } else {
            weeklyLimitText = " [" + weekLimit.toString() + "€]";
        }
        
        int option;
        do {
            System.out.println("===================");
            System.out.println("   NOTIFICATIONS   ");
            System.out.println("===================");
            System.out.println();

            System.out.println("1. Weekly Limit" + weeklyLimitText);
            System.out.println("2. Monthly Limit");
            System.out.println("");
            System.out.println("0. Back to Main Menu");
            System.out.println();
            System.out.println();

            option = Console.readInteger("Please choose a option");

            switch (option) {
                case 0:
                    return;

                case 1:                                        
                    break;
                
                case 2:                                        
                    break;
            }
        } while (option != 0);


       
    }

    @Override
    public BaseController buildBaseController() {        
        return controller;
    }
}
