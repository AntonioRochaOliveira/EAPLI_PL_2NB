/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author sdcastro
 */
public class GestaoDespesas {
           

    public BigDecimal getGastoSemanal() {
        Calendar today = Calendar.getInstance();        
        Date todayDate = today.getTime();
        
        BigDecimal weekExpense = BigDecimal.ZERO;
        
        

        for (Expense e : ExpenseRepository.getListExpense()) {
            if(DateTime.getDateDiff(e.getDateOccurred(), todayDate, TimeUnit.DAYS) < 7 ) {         
                weekExpense = weekExpense.add(e.getAmount());
            }
            
        }        
        
        return weekExpense;
    }
}
