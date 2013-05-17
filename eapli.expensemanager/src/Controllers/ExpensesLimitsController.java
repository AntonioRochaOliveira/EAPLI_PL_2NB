/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;
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
    

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
