/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.math.BigDecimal;
import sun.security.jca.GetInstance;

/**
 *
 * @author i111057
 */
public class StartingBalanceRepository {
    private static StartingBalanceRepository instance = null;
    private BigDecimal initial;
    
    protected StartingBalanceRepository()
    {
         initial = new BigDecimal(0);
    }
    
    public static StartingBalanceRepository instance(){
        if(instance == null) {
         instance = new StartingBalanceRepository();
         return instance;
        }
        return instance;
    }
    
    public static BigDecimal getValue() {
      return instance.initial;
   }
    
    public static void setValue(BigDecimal value) {

         instance.initial = value;
   }
}
