/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Fábio Mendonça/Fernando Silva
 */
public class BalanceController {
    
    public BalanceController(){               
    }
    
    //Methods
    public float getBalance(){
        
        final CheckingAccount valuesCalculator=new CheckingAccount();
        
        return valuesCalculator.getBalance();
    }
    
}
