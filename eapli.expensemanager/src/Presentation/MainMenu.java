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
            System.out.println("6. Start Balance");
            System.out.println("7. View Balance");
            System.out.println("8. Register payment mode");
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
                    break;
                case 5:
                    MonthlyExpenseUI uiME = new MonthlyExpenseUI();
                    break;
                case 6:
                    StartingBalanceUI uiSB = new StartingBalanceUI();
                    uiSB.mainLoop();
                    break;
                case 7:
                    BalanceUI a = new BalanceUI();
                    System.out.println("O saldo atual é " + a.buildBaseController().getBalance());
                    break;
                case 8:
                    new PayModeUI();
                    break;

            }
        } while (option != 0);
    }
}
