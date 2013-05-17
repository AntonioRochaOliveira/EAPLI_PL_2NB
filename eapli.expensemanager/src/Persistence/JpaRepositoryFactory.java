/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
class JpaRepositoryFactory implements RepositoryFactory {

    @Override
    public IExpenseRepository iexpenseRepository() {
        return new Persistence.JPA.ExpenseRepositoryImpl();
    }

    @Override
    public TypeOfExpenseRepository TypeOfExpenseRepository() {
        return new Persistence.JPA.TypeOfExpenseRepositoryImpl();
    }

    @Override
    public IncomeTypeRepository buildIncomeTypeRepository() {
        return new Persistence.JPA.IncomeTypeRepositoryImpl();
    }

    @Override
    public IPaymentTypeRepository buildPaymentTypeRepository() {
        return new Persistence.JPA.PaymentTypeRepositoryImpl();
    }

    @Override
    public IPayModeRepository buildPayModeRepository() {
        return new Persistence.JPA.PayModeTypeRepositoryImpl();
    }

    @Override
    public StartingBalanceRepository buildStartingBalanceRepository() {
        // TODO // TODO Implementar método buildStartingBalanceRepository() in JPARepositoryFactory class
        return null;
    }

    @Override
    public IExpensesLimitsRepository buildExpensesLimitsRepository() {
        return new Persistence.JPA.ExpensesLimitsRepositoryImpl();
    }

    @Override
    public IncomeRepository buildIncomeRepository() {
        return new Persistence.JPA.IncomeRepositoryImpl();
    }

    @Override
    public CheckingAccountRepository buildCheckingAccountRepository() {
        // TODO Implementar método buildStartingBalanceRepository() in InMemoryRepositoryFactory class
        return null;
    }
}
