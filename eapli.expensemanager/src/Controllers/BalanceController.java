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
public class BalanceController extends BaseController{
    
    public BalanceController(){               
    }
    
    //Methods
//    public BigDecimal getBalance(){
//        
//        CheckingAccount valuesCalculator=buildCheckingAccount();
//        
//        return valuesCalculator.getBalance();
//    }
    
    public CheckingAccount buildCheckingAccount(){
        
        return new CheckingAccount();
    }
    
}
