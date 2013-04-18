package Presentation;

import eapli.util.Console;
import Controllers.BaseController;
import Controllers.RegisterIncomeTypeController;

public class RegisterIncomeTypeUI extends BaseUI{
	RegisterIncomeTypeController controller;
	public RegisterIncomeTypeUI(){
		controller = new RegisterIncomeTypeController();
	}
	
	private String readName(){
        return Console.readLine("Name:");
	}
	
	private String readDescription(){
		return Console.readLine("Description:");
	}

	@Override
	public BaseController buildBaseController() {
		return controller;
	}

	@Override
	public String getTitle() {
		return  "REGISTER AN INCOME TYPE";
	}

	@Override
	public void showContent() {
		String name = readName();
		String description = readDescription();
		controller.regIncomeType(name,description);
		System.out.println("New Income Type Recorded.");
	}
}
