package Presentation;

import Controllers.BaseController;

public class BaseUI {
	BaseController baseController;
	
	public BaseUI(){
	}

	public void displayBalance(){
		if(baseController == null){
			System.err.println("Base controller undefined");
			return;
		}
		System.out.printf("* * *  CURRENT BALANCE  %.2f * * *\n",baseController.getBalance());
	}
}
