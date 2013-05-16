/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Persistence.StartingBalanceRepository;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class StartingBalanceRepositoryImpl implements StartingBalanceRepository{
    private static StartingBalanceRepositoryImpl instance = null;
    private BigDecimal initial;
    
    protected StartingBalanceRepositoryImpl()
    {
         initial = new BigDecimal(0);
    }
    
    public static StartingBalanceRepositoryImpl instance(){
        if(instance == null) {
            instance = new StartingBalanceRepositoryImpl();
            return instance;
        }
        
        return instance;
    }
    
    @Override
    public BigDecimal getValue() {
      return instance.initial;
   }
    
    @Override
    public void setValue(BigDecimal value) {

         instance.initial = value;
   }
}
