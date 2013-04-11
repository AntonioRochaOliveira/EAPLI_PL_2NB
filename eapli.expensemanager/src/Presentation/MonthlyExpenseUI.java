/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

/**
 *
 * @author João
 */
import Controllers.MonthlyExpenseController;

import Model.IncomeType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



   public class MonthlyExpenseUI {
    
    MonthlyExpenseController controller;
    List<IncomeType> listIncomeType;

    public MonthlyExpenseUI(){
        
		controller = new MonthlyExpenseController();
		System.out.println("* * *  Monthly Expense  * * *\n");
                
                
                 Date date = readDate();
                 String what = readDescription();
                 
                 listIncomeType = new ArrayList<IncomeType>();
                 ;
                 IncomeType incomeType = selectIncomeType(listIncomeType);

		//controller.createMonthlyExpense( incomeType, what, date);
		
	}
    
   
    
    private Date readDate(){
        return Console.readDate("When:");
    }
    
    private String readDescription(){
            return Console.readLine("Description:");
    }

    private IncomeType selectIncomeType(List<IncomeType> listIncomeType) {
        
        System.out.println("===================");
        System.out.println("  INCOME TYPES  ");
        System.out.println("===================\n");

        for (int i=0; i< listIncomeType.size();i++){
            System.out.println((i+1) + ". "+ listIncomeType.get(i).getName());
        }

        int option = Console.readInteger("Please choose a option");
        
        if(option>0 && option < listIncomeType.size()){
            return listIncomeType.get(option-1);
        }
        return null;
    }
}
