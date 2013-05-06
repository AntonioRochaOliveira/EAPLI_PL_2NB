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
        return new Persistence.JPA.ExpenseRepositoryImpl();
    }

    @Override
    public TypeOfExpenseRepository TypeOfExpenseRepository() {
        return new Persistence.InMemory.TypeOfExpenseRepositoryImpl();
    }

    @Override
    public IncomeTypeRepository buildIncomeTypeRepository() {
        return new Persistence.InMemory.IncomeTypeRepositoryImpl();
    }

    @Override
    public IPaymentTypeRepository buildPaymentTypeRepository() {
        return Persistence.InMemory.PaymentTypeRepositoryImpl.getInstance();
    }

    @Override
    public IPayModeRepository buildPayModeRepository() {
        return Persistence.InMemory.PayModeRepositoryImpl.getInstance();
    }
}
