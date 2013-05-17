/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public interface CheckingAccountRepository {

    public BigDecimal getValue();

    public void setValue(BigDecimal value);
}
