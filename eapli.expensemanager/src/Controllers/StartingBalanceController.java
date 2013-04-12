/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class StartingBalanceController {
    public StartingBalanceController()
    {
    }
    
    public void setValue(BigDecimal amount)
    {
        CheckingAccount account = new CheckingAccount();
        account.setValue(amount);
    }
    
    public BigDecimal getValue()
    {
        CheckingAccount account = new CheckingAccount();
        return account.getValue();
    }
}
