/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import Controllers.BaseController;
import Controllers.ExpenseRegisterController;
import Controllers.RegisterPayModeController;
import Model.PayMode;
import Model.TypeOfExpense;
import Persistence.PayModeRepository;
import eapli.util.Console;

/**
 *
 * @author Márcio Martins & Miguel Ribeiro
 */
class ExpenseRegisterUI extends BaseUI{
    ExpenseRegisterController controller;
    public void mainLoop() {
        
        controller = new ExpenseRegisterController();
        showContent();        
    }
    
    @Override
	public BaseController buildBaseController() {
		return controller;
	}

    @Override
    public void showContent() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        /* AMOUNT */
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        /* TYPEOFEXPENSE */
        TypeOfExpense tE = new TypeOfExpense("", "");
        System.out.println("Select expense type. [0] to creat new.");
        List<TypeOfExpense> lista = controller.getExpenseTypes();
        
        int type;/* Index of type expense */
        if(lista.size() > 0)
        {
            for(int i=0;i<lista.size();i++){
                System.out.println(i+1+":"+lista.get(i));
            }
        }
        type = Console.readInteger("Option:");
        if(type == 0) //If the user wishes to create a new
        {
            
        }else{
            tE = lista.get(type - 1);
        }
        
        /* DATE */
        Date date = Console.readDate("Date of Expense: dd-MM-yyyy");
        
        /* PAYMODE */
        PayMode pM = new PayMode(null, null);// Var to insert on new Expense
        List<PayMode> listaPM = PayModeRepository.getInstance().getPayMode(); // WRONG WAY. NEED TO COMUNICATE TO CONTROLLER OF PAYMODE
        System.out.println("Select PayMode of Expense. [0] to creat new.");
        for (int i = 0; i < listaPM.size(); i++)
        {
            System.out.println(i+1+": "+listaPM.get(i)+"\n");
        }
        int op = Console.readInteger("Option:");
        
        if(op == 0) // If the user wishes to create a new
        {
            PayModeUI pMUI;
            pMUI = new PayModeUI(); //Creat new UI to creat new PayMode
            pMUI.showContent();
            BaseController bC = pMUI.buildBaseController();
            if(bC instanceof RegisterPayModeController)
            {
               RegisterPayModeController pMC = (RegisterPayModeController)pMUI.buildBaseController(); 
               pM = pMC.getPayMode();
            }    
        }else{
            pM = listaPM.get(op - 1);
        }
        
        /* DESCRIPTION */
        String what = Console.readLine("Description:");
        
        /* SAVING */
        controller.registerExpense(amount,tE,date,pM,what);
     
        System.out.println("expense recorded.");
    }
    @Override
    public String getTitle()
    {
		return "Expense Register";
    }
}
