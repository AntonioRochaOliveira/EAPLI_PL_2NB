/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

/**
 *
 * @author arocha
 */
class InMemoryRepositoryFactory implements RepositoryFactory {

    @Override
    public IExpenseRepository iexpenseRepository() {
        return Persistence.InMemory.ExpenseRepositoryImpl.getInstance();
    }

    @Override
    public TypeOfExpenseRepository TypeOfExpenseRepository() {
        return Persistence.InMemory.TypeOfExpenseRepositoryImpl.instance();
    }

    @Override
    public IncomeTypeRepository buildIncomeTypeRepository() {
        return Persistence.InMemory.IncomeTypeRepositoryImpl.getInstance();
    }

    @Override
    public IPaymentTypeRepository buildPaymentTypeRepository() {
        return Persistence.InMemory.PaymentTypeRepositoryImpl.getInstance();
    }

    @Override
    public IPayModeRepository buildPayModeRepository() {
        return Persistence.InMemory.PayModeRepositoryImpl.getInstance();
    }

    @Override
    public StartingBalanceRepository buildStartingBalanceRepository() {
        // TODO // TODO Implementar método buildStartingBalanceRepository() in JPARepositoryFactory class
        return null;
    }

    @Override
    public CheckingAccountRepository buildCheckingAccountRepository() {
        // TODO Implementar método buildStartingBalanceRepository() in InMemoryRepositoryFactory class
        return null;
    }

    @Override
    public IncomeRepository buildIncomeRepository() {
        return Persistence.InMemory.IncomeRepositoryImpl.getInstance();
    }
}
