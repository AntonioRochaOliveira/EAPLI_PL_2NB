/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Income;
import Persistence.IncomeRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Joel Ferreira | jverde
 */

public class IncomeRepositoryImpl extends JpaRepository<Income, String> implements IncomeRepository {

//	FIXME: Verificar se esta alteração faz sentido: - Bruno Flávio.
//	Modifiquei para podermos inserir tipos de Rendimentos.
	
//     JpaRepository<Income, String> util;
//	
//	public IncomeRepositoryImpl(){
//		util = new JpaRepository<Income, String>();
//	}
//    
    @Override
    public List<Income> getListIncome() {
//    	FIXME: Verificar se esta alteração faz sentido: - Bruno Flávio.
//    	Modifiquei para podermos inserir tipos de Rendimentos.
    	//return util.all();
    	
        return all();
    }
    
    @Override
    public Income saveIncome(Income income) {
            if(income.getDescription() == null || income.getDescription().trim().length() == 0){
                    throw new IllegalArgumentException();
            }
            if(income.getIncomeType() == null){
                    throw new IllegalArgumentException();
            }
            if(income.getAmount() == new BigDecimal(0.0) ){
                    throw new IllegalArgumentException();
            }
//        	FIXME: Verificar se esta alteração faz sentido: - Bruno Flávio.
//        	Modifiquei para podermos inserir tipos de Rendimentos.
        	//income = util.saveIncome(income);   
            
            income = save(income);
            return income;
    }

}
