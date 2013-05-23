/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.math.BigDecimal;
import Model.CheckingAccount;
import Model.ExpensesLimits;
import Persistence.IExpensesLimitsRepository;
import Persistence.PersistenceFactory;

/**
 *
 * @author Paulo Mendes
 * @author Sérgio Castro
 */
public class ExpensesLimitsController extends BaseController {

    IExpensesLimitsRepository expensesLimitsRepository;

    public ExpensesLimitsController() {
        expensesLimitsRepository = PersistenceFactory.buildPersistenceFactory().buildExpensesLimitsRepository();
    }

    public BigDecimal getWeeklyLimit() {
        return PersistenceFactory.buildPersistenceFactory().buildExpensesLimitsRepository().getWeeklyLimit();
    }

    public void setWeeklyLimit(BigDecimal newWeeklyLimit) {
        ExpensesLimits expensesLimits = new ExpensesLimits("weekly", newWeeklyLimit);
        IExpensesLimitsRepository repo = PersistenceFactory.buildPersistenceFactory().buildExpensesLimitsRepository();
        repo.saveLimits(expensesLimits);
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
