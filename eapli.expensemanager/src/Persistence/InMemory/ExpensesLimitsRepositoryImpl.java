package Persistence.InMemory;

import Model.ExpensesLimits;
import Persistence.IExpensesLimitsRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExpensesLimitsRepositoryImpl implements IExpensesLimitsRepository {

    private static IExpensesLimitsRepository instance = null;
    private List<ExpensesLimits> list;

    private ExpensesLimitsRepositoryImpl() {
        list = new ArrayList<ExpensesLimits>();
    }

    public static synchronized IExpensesLimitsRepository getInstance() {
        if (instance == null) {
            instance = new ExpensesLimitsRepositoryImpl();
        }
        return instance;
    }

    
    @Override
    public void save(ExpensesLimits expensesLimits) {
        list.add(expensesLimits);
    }

    @Override
    public BigDecimal getWeeklyLimit() {
        for (ExpensesLimits limit : list) {
            if ( limit.getLimitType().equalsIgnoreCase("weekly") ) {
                return limit.getLimitValue();
            }
        }
        
        return BigDecimal.ZERO;
    }
}
