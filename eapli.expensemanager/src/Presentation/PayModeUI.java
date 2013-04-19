/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.RegisterPayModeController;
import eapli.util.Console;
import java.util.List;

/**
 *
 * @author xiko
 */
public class PayModeUI extends BaseUI {

    private RegisterPayModeController controller;

    public PayModeUI() {
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
        } else if (classType.equals("Integer")) {
            return Console.readInteger(variableName);
        } else if (classType.equals("Date")) {
            return Console.readDate(classType);
        } else if (classType.equals("Double")) {
            return Console.readDouble(variableName);
        } else if (classType.equals("Boolean")) {
            return Console.readBoolean(variableName);
        }
        //Erro
        return null;
    }
    
    @Override
    public String getTitle(){
		
		return "Registar Meio de Pagamento";
	}

    @Override
    public void showContent() {
        System.out.println("* * *  REGISTER A PAYMENT MODE  * * *\n");
        controller = new RegisterPayModeController(this);
        System.out.println("Payment Mode recorded.");
    }

    @Override
    public BaseController buildBaseController() {
        return controller;
    }
}
