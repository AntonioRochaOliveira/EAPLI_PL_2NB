package Presentation;

import Controllers.BaseController;

public abstract class BaseUI {
	
	public BaseUI(){
	}

	public void displayBalance(){
		System.out.printf("* * *  CURRENT BALANCE  %.2f * * *\n",buildBaseController().getBalance());
	}
	
	public abstract BaseController buildBaseController();
}
