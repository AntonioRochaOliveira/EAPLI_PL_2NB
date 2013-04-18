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
        
        System.out.println("Selecione o tipo de despesa");
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
        type = Console.readInteger("Indice:");
        
        Date date = Console.readDate("Data da Despesa:");
        //PayMode pM = new PayMode();//Input tipo de pagamento
        //Input detalhes de pagamento
        
        String what = Console.readLine("Comentário:");
        
        
        

        controller.registerExpense(amount,lista.get(type),date,null,what);
     
        System.out.println("expense recorded.");
    }
    @Override
    public String getTitle()
    {
		return "Expense Register";
    }
}
