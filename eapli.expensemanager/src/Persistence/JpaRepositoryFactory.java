/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Persistence.JPA.ExpenseRepositoryImpl;


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



}

