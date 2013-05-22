package Persistence.JPA;

import Model.ExpensesLimits;
import Persistence.IExpensesLimitsRepository;
import java.math.BigDecimal;
import java.util.List;

public class ExpensesLimitsRepositoryImpl extends JpaRepository<ExpensesLimits, Integer> implements IExpensesLimitsRepository {

    @Override
    public void saveLimits(ExpensesLimits expensesLimits) {
        //ToDo: Validação
        //if (expensesLimits.getId() == ... {
        //    			throw new IllegalArgumentException();
        //}
        
        List<ExpensesLimits> allLimits = getAllLimits();

        boolean exist = false;
        for (ExpensesLimits limit : allLimits) {
            if (limit.getLimitType().equalsIgnoreCase(expensesLimits.getLimitType())) {
                exist = true;                
                                                             
                //ToDo: Update não está a funcionar
                // utilizar o save provoca um erro de violação de chave primária,
                // mas atualiza corretamente o valor                
                limit.setLimitValue(expensesLimits.getLimitValue());                
                save(limit);                
            }
        }

        if (!exist) {
            save(expensesLimits);   //insert new limit
        }


        
    }

    public void updateLimits(ExpensesLimits expensesLimits) {
        update(expensesLimits);
    }

    private List<ExpensesLimits> getAllLimits() {
        return all();

    }

    @Override
    public BigDecimal getWeeklyLimit() {
        List<ExpensesLimits> allLimits = getAllLimits();

        for (ExpensesLimits limit : allLimits) {
            if (limit.getLimitType().equalsIgnoreCase("weekly")) {
                return limit.getLimitValue();
            }
        }

        return BigDecimal.ZERO;
    }
}
