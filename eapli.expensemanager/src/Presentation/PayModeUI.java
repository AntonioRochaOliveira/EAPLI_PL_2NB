/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.RegisterPayModeController;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author xiko
 */
public class PayModeUI {

    public PayModeUI() {
    }
    
    public void mainLoop() {
        System.out.println("* * *  REGISTER A PAYMENT MODE  * * *\n");
       
        RegisterPayModeController controller = new RegisterPayModeController(this); 
        System.out.println("Payment Mode recorded.");
    }
    
    public String getPaymentType(List<String> types) {
        System.out.print("Payment Types\n");
        int i = 0;
        for (String s : types) {
            System.out.print("\n" + (++i) + " " + s);
        }
        System.out.println("\n");
        int option = Console.readInteger("Choose one type of payment");

        return types.get(--option);
    }

    public Object getAditionalInformation(String variableName, String classType) {
        if (classType.equals("String")) {
            return Console.readLine(variableName);
        } else 
            
         if (classType.equals("Integer")) {
            return Console.readInteger(variableName);
        } else 
        
         if (classType.equals("Date")) {
            return Console.readDate(classType);
        } else 
             
         if (classType.equals("Double")) {
            return Console.readDouble(variableName);
        } else 
              if (classType.equals("Boolean")) {
            return Console.readBoolean(variableName);
        }
        //Erro
        return null;
    }
}
