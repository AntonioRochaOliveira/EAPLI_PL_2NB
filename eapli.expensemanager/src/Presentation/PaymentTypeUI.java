/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.PaymentTypeController;
import eapli.util.Console;

/**
 *
 * @author xiko
 */
public class PaymentTypeUI {

    public PaymentTypeUI(PaymentTypeController controller) {
        int option;
        System.out.println("* * *  Payment Type  * * *");
        System.out.println(""
                + "1 - Cash"
                + "\n2 - Check"
                + "\n3 - Credit Card"
                + "\n4 - Debit Card\n");
        do {
            option = Console.readInteger("Please choose a option");
        } while (option < 1 || option > 4);

        switch (option) {
            case 1:
                controller.createPaymentType("Cash");
                break;
            case 2:
                int chequeNumber = Console.readInteger("Check Number:");
                 controller.createPaymentType("Check");
               
                controller.addAditionalInformation("Check number",chequeNumber);
                break;
            case 3:
               controller.createPaymentType("Credit Card");
                break;
            case 4:
                controller.createPaymentType("Debit Card");
                break;

        }

    }
}
