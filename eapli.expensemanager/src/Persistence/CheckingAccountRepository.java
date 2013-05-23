/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.CheckingAccount;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public interface CheckingAccountRepository {

    public BigDecimal getValue();

    public CheckingAccount save(CheckingAccount ChAc);
    
}
