/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joel
 */
public class CheckingAccount {
    
    private List list;
    
    public boolean createIncome(BigDecimal amount, IncomeType incomeType, String what, Date date) {
        Income income = new Income(amount, incomeType, what, date);
        if (add(income)){
            try {
                IncomeRepository repo = new IncomeRepository();
                repo.save(income);
            } catch (Exception e) {
                System.out.print(e);
            }
            return true;
        }
        else
            return false;
    }
    
    private boolean add(Income income){
        try {
            this.list.add(income);
            return true;
        } catch (Exception e) {
            System.out.print(e);
            return false;
        }
    }
}
