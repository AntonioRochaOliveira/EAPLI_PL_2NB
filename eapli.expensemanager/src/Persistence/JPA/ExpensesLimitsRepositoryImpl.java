package Persistence.JPA;

import Model.ExpensesLimits;
import Persistence.IExpensesLimitsRepository;


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
    
    
}
