package Presentation;

import Controllers.BaseController;
import Controllers.TypeOfExpenseController;
import eapli.util.Console;


public class TypeOfExpenseUI extends BaseUI{
    TypeOfExpenseController controller;
     public void mainLoop() {
        System.out.println("* * *  REGISTER A NEW TYPE OF EXPENSE  * * *\n");
        String desc = Console.readLine("Description: ");
        String shortName = Console.readLine("Short name: ");
        TypeOfExpenseController controller = new TypeOfExpenseController();
        controller.TypeOfExpense(shortName, desc);
        System.out.println("Type of expense recorded.");
    }

     
    @Override
    public void showContent() {
     
    }

    
    @Override
    public BaseController buildBaseController() {
        return controller;
    }
}
