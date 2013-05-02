package Presentation;

import Controllers.TypeOfExpenseController;
import eapli.util.Console;


public class TypeOfExpenseUI {
     public void mainLoop() {
        System.out.println("* * *  REGISTER A NEW TYPE OF EXPENSE  * * *\n");
        String desc = Console.readLine("Description: ");
        String shortName = Console.readLine("Short name: ");
        TypeOfExpenseController controller = new TypeOfExpenseController();
        controller.TypeOfExpense(desc, shortName);
        System.out.println("Type of expense recorded.");
    }
}
