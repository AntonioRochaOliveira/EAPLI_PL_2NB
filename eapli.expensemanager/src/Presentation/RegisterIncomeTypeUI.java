package Presentation;

import eapli.util.Console;
import Controllers.RegisterIncomeTypeController;

public class RegisterIncomeTypeUI {
	RegisterIncomeTypeController controller;
	
	public RegisterIncomeTypeUI(){
		controller = new RegisterIncomeTypeController();
		System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
		String name = readName();
		String description = readDescription();
		controller.regIncomeType(name,description);
		System.out.println("New Income Type Recorded.");
	}
	
	private String readName(){
        return Console.readLine("Name:");
	}
	
	private String readDescription(){
		return Console.readLine("Description:");
	}
}
