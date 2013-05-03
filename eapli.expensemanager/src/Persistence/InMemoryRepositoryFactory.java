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
	public IncomeTypeRepository buidIncomeTypeRepository() {
		return new Persistence.InMemory.IncomeTypeRepositoryImpl();
	}


}
