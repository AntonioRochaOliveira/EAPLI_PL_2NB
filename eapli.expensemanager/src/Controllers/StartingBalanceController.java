/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

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
        Accounting account = new Accounting();
        account.setValue(amount);
    }
    
    public BigDecimal getValue()
    {
        Accounting account = new Accounting();
        return account.getValue();
    }
}
