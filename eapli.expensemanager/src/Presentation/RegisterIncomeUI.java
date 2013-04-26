/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.RegisterIncomeController;
import Model.IncomeType;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Joel Ferreira
 */
public class RegisterIncomeUI extends BaseUI {
    
    RegisterIncomeController controller;
    List<IncomeType> listIncomeType;

    public RegisterIncomeUI() {
        controller = new RegisterIncomeController();
    }
    
    @Override
    public void showContent() {
        

         BigDecimal amount = readAmount();
         Date date = readDate();
         String what = readDescription();

         listIncomeType = new ArrayList<IncomeType>();
         listIncomeType = controller.getIncomeTypes();
         IncomeType incomeType = selectIncomeType(listIncomeType);

        controller.createIncome(amount, incomeType, what, date);
        System.out.println("New Income Recorded.");
    }
    
    private BigDecimal readAmount(){
        return new BigDecimal(Console.readDouble("Amount:"));
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
        
        if(option>0 && option <= listIncomeType.size()){
            return listIncomeType.get(option-1);
        } else return selectIncomeType(listIncomeType);
    }

    @Override
    public String getTitle()
    {
		return "REGISTER AN INCOME";
    }
    
    @Override
	public BaseController buildBaseController() {
		return controller;
	}
}
