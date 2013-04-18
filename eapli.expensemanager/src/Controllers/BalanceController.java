/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import Model.CheckingAccount;
import java.math.BigDecimal;
/**
 *
 * @author Fábio Mendonça/Fernando Silva
 */
public class BalanceController{
    
    public BalanceController(){               
    }
    
    //Methods
    public BigDecimal getBalance(){
        
        CheckingAccount valuesCalculator=new CheckingAccount();
        
        return valuesCalculator.getBalance();
    }
    
}
