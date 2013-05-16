/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;
import Persistence.StartingBalanceRepository;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class StartingBalanceRepositoryImpl extends JpaRepository<BigDecimal, String> implements StartingBalanceRepository{

    @Override
    public BigDecimal getValue() {
        return super.all().get(0);
    }

    @Override
    public void setValue(BigDecimal value) {
        super.save(value);
    }
    
}
