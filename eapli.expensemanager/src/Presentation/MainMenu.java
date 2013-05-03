/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Model.CheckingAccount;
import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {

    public void mainLoop() {
        int option;
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");

            System.out.println("1. Register an expense");
            System.out.println("2. Register income type");
            System.out.println("3. Register expense type");
            System.out.println("4. Register an Income");
            System.out.println("5. View Month Expenses");
            System.out.println("6. View Week Expenses");
            System.out.println("7. Start Balance");
            System.out.println("8. View Balance");
            System.out.println("9. Register payment mode");
            System.out.println("10. Register Geographic Zone");
            System.out.println("0. Exit\n\n");

            option = Console.readInteger("Please choose a option");

            switch (option) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.mainLoop();
                    break;
                case 2:
                    RegisterIncomeTypeUI uiRIT = new RegisterIncomeTypeUI();
                    uiRIT.show();
                    break;
                case 3:
                    TypeOfExpenseUI uiTOE = new TypeOfExpenseUI();
                    uiTOE.mainLoop();
                    break;
                case 4:
                    RegisterIncomeUI uiRI = new RegisterIncomeUI();
                    uiRI.show();
                    break;
                case 5:
                    MonthlyExpenseUI uiME = new MonthlyExpenseUI();
                    break;
                case 6:
                    System.out.println("To be implemented.");
                    /* WeeklyExpenseUI uiWE = new WeeklyExpenseUI(); */
                    break;
                case 7:
                    StartingBalanceUI uiSB = new StartingBalanceUI();
                    uiSB.show();
                    break;
                case 8:
                    BalanceUI a = new BalanceUI();
                    System.out.println("Balance: " + a.buildBaseController().getBalance());
                    break;
                case 9:
                    new PayModeUI();
                    new PayModeUI().showContent();
                    break;
                    
                case 10:
                    new GeoZoneRegisterUI();
                    break;
            }
        } while (option != 0);
    }
}
