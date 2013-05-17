package Persistence;

import Model.ExpensesLimits;
import java.math.BigDecimal;

public interface IExpensesLimitsRepository {

    public void save(ExpensesLimits expensesLimits);
    
    public BigDecimal getWeeklyLimit();
}
