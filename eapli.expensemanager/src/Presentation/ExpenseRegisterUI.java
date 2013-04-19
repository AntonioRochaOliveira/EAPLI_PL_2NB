/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseRegisterController;
import Model.PayMode;
import Model.TypeOfExpense;
import Persistence.ExpenseRepository;
import Persistence.PayModeRepository;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        System.out.println("Select type of expense");
        ExpenseRepository eR = new ExpenseRepository();
        List<TypeOfExpense> lista = new ArrayList<TypeOfExpense>();
        lista = controller.getExpenseTypes();
        int type;/* Index of type expense */
        if(lista.size() > 0)
        {
            for(int i=0;i<lista.size();i++){
                System.out.println(i+1+":"+lista.get(i));
            }
        }
        type = Console.readInteger("Option:");
            
        Date date = Console.readDate("Date of Expense:");
        
        PayMode pM;
        List<PayMode> listaPM = PayModeRepository.getInstance().getPayMode();
        System.out.println("Select PayMode of Expense. [0] to creat new.");
        for (int i = 0; i < listaPM.size(); i++)
        {
            System.out.println(i+1+": "+listaPM.get(i)+"\n");
        }
        int op = Console.readInteger("Option:");
        
        if(op == 0)
        {
            PayModeUI pMUI = new PayModeUI();
            pMUI.showContent();
        }
        // DO NOT SUPORT ERRORS OF INDEX
        pM = listaPM.get(op - 1);
                
        String what = Console.readLine("Description:");
        
        controller.registerExpense(amount,lista.get(type - 1),date,pM,what);
     
        System.out.println("expense recorded.");
    }
    @Override
    public String getTitle()
    {
		return "Expense Register";
    }
}
