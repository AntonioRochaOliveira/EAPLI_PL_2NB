/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.CheckingAccount;
import Persistence.CheckingAccountRepository;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class CheckingAccountImpl extends JpaRepository<CheckingAccount, String> implements CheckingAccountRepository {
    
    @Override
    public BigDecimal getValue(){
        return super.all().get(0).getValue();
    }
}
