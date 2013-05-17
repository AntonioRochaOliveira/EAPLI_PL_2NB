package Persistence.JPA;

import Model.ExpensesLimits;
import Persistence.IExpensesLimitsRepository;
import java.math.BigDecimal;
import java.util.List;

public class ExpensesLimitsRepositoryImpl implements IExpensesLimitsRepository {

    JpaRepository<ExpensesLimits, Integer> util;

    public ExpensesLimitsRepositoryImpl() {
        util = new JpaRepository<ExpensesLimits, Integer>();
    }

    @Override
    public void save(ExpensesLimits expensesLimits) {
        //ToDo: Validação
        //if (expensesLimits.getId() == ... {
        //    			throw new IllegalArgumentException();
        //}

        util.save(expensesLimits);
    }

    private List<ExpensesLimits> getAllLimits() {
        return util.all();

    }

    @Override
    public BigDecimal getWeeklyLimit() {
        List <ExpensesLimits> allLimits = getAllLimits();
        
        for (ExpensesLimits limit : allLimits) {
            if ( limit.getLimitType().equalsIgnoreCase("weekly") ) {
                return limit.getLimitValue();
            }
        }
        
        return BigDecimal.ZERO;
    }
}
