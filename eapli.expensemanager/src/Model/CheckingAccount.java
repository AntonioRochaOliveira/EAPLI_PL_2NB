/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.ExpenseRepository;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author joel
 */
public class CheckingAccount {
    
	IncomeRepository incomeRepo;
	ExpenseRepository expenseRepo;
    
    public CheckingAccount() {
    	incomeRepo = new IncomeRepository();
    	expenseRepo = new ExpenseRepository();
    }
    
    public void add(Income income){
            incomeRepo.save(income);
    }
    
    public void add(Expense expense) {
    	expenseRepo.save(expense);
    }
}
