/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.NotificationsController;
import Controllers.RegisterPayModeController;
import Model.PayMode;
import Model.TypeOfExpense;
import Persistence.IPayModeRepository;
import Persistence.PersistenceFactory;
import Persistence.RepositoryFactory;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

        int option;
        do {
            System.out.println("===================");
            System.out.println("   NOTIFICATIONS   ");
            System.out.println("===================");
            System.out.println();

            System.out.println("1. Weekly Limit");
            System.out.println("0. Back to Main Menu");
            System.out.println();
            System.out.println();

            option = Console.readInteger("Please choose a option");

            switch (option) {
                case 0:
                    return;

                case 1:
                   
                    break;
            }
        } while (option != 0);


       
    }

    @Override
    public BaseController buildBaseController() {        
        return controller;
    }
}
