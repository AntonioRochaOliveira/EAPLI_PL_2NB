/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

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
class ExpenseRegisterUI {
    public void mainLoop() {
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        
        System.out.println("Selecione o tipo de despesa");
        ExpenseRepository eR = new ExpenseRepository();
        List<TypeOfExpense> lista = new ArrayList<TypeOfExpense>();
        lista = controller.getExpenseTypes();
        int type; /* Index of type expense */
        if(lista.size() > 0)
        {
            System.out.println(i+1+":"+lista.get(i));
        }
        int type = Console.readInteger("Indice:");
        
        Date date = Console.readDate("Data da Despesa:");
        //PayMode pM = new PayMode();//Input tipo de pagamento
        //Input detalhes de pagamento
        
        String what = Console.readLine("Comentário:");
        
        
        

        controller.registerExpense(amount,lista.get(type),date,null,what);
     
        System.out.println("expense recorded.");
    }
}
