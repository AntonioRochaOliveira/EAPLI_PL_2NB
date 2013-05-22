package Persistence;

import Model.ExpensesLimits;
import java.math.BigDecimal;

public interface IExpensesLimitsRepository {

    public void saveLimits(ExpensesLimits expensesLimits);
    
    public BigDecimal getWeeklyLimit();
}
