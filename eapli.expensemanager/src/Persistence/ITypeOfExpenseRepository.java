/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import java.util.List;

import Model.TypeOfExpense;

/**
 *
 * @author Karlos
 */
public interface ITypeOfExpenseRepository {
     void save(TypeOfExpense Texp);
    
    List<TypeOfExpense> getAllTypeOfExpenses();  
}
