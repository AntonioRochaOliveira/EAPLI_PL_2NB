/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

<<<<<<< HEAD
/**
 *
 * @author Joana
 */
public class IncomeRepository {
    
=======
import Model.Income;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jverde
 */
public class IncomeRepository {
    
    private List<Income> list;

	public IncomeRepository(){
		list = new ArrayList<Income>();
	}

	public void save(Income income) {
		list.add(income);
	}
>>>>>>> 9292ff9c82c66c0ae68f565702e46b7769af1b3f
}
