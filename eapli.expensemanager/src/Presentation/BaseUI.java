package Presentation;

import Controllers.BaseController;

public abstract class BaseUI {
	
//	public BaseUI(){
//	}
//
//	public void displayBalance(){
//		System.out.printf("* * *  CURRENT BALANCE  %.2f * * *\n",buildBaseController().getBalance());
//	}
//	
//	public abstract BaseController buildBaseController();
	
	public void show(){
		showHeader();
		showContent();
		showFooter();
	}
	
	public void showHeader(){
		System.out.print("* * * "+ getTitle() +" * * *\n");
	}
	
	public void showFooter(){
		System.out.printf("* * *  CURRENT BALANCE  %.2f * * *\n",buildBaseController().getBalance());
	}
	
	
	public String getTitle(){
		//In implementation return null for default Title
		return this.getClass().getSimpleName();
	}
	
	//Implement your UI here
	public abstract void showContent();
	
	//Return your controller 
	public abstract BaseController buildBaseController();
	
}
