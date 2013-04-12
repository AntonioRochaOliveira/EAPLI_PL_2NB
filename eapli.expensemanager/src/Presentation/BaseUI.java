package Presentation;

import java.util.concurrent.ConcurrentHashMap;

public class BaseUI {
	BaseController controller;
	
	public BaseUI(BaseController controller){
		this.controller = controller;
	}

	public void displayBalance(){
		System.out.printf("* * *  CURRENT BALANCE  %.2f * * *\n",controller.getBalance());
	}
}
