/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.math.BigDecimal;
//import sun.security.jca.GetInstance;

/**
 *
 * @author i111057
 */
public interface StartingBalanceRepository {
    
    public BigDecimal getValue();
    public void setValue(BigDecimal value);
}
