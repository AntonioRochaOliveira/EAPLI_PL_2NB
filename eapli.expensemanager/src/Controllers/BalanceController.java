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
        
        Accounting valuesCalculator=new Accounting();
        
        return valuesCalculator.getBalance();
    }
    
}
