package Persistence.InMemory;

import Model.ExpensesLimits;
import Model.IncomeType;
import Persistence.IExpensesLimitsRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExpensesLimitsRepositoryImpl implements IExpensesLimitsRepository {

    private static IExpensesLimitsRepository instance = null;
    private BigDecimal weeklyLimit;
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
    public void save(Expenses weeklyLimit) {
        this.weeklyLimit = weeklyLimit;
    }

    public BigDecimal getWeeklyLimit() {
        return weeklyLimit;
    }
}
