/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpensesLimitsController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author sdcastro
 */
public class NotificationsUI extends BaseUI {

    private ExpensesLimitsController controller = null;

    public void showSubMenu() {

        controller = new ExpensesLimitsController();
        showContent();
    }

    @Override
    public void showContent() {

        String weeklyLimitText;
        BigDecimal weeklyLimit;
        int option;

        do {
            weeklyLimit = controller.getWeeklyLimit();

            if (weeklyLimit.compareTo(BigDecimal.ZERO) == 0) {
                weeklyLimitText = " [NOT SET]";
            } else {
                weeklyLimitText = " [" + weeklyLimit.toString() + "€]";
            }

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
                    int value = Console.readInteger("New Weekly Limit");
                    controller.setWeeklyLimit(new BigDecimal(value));
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
