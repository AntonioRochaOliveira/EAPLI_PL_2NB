/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.TypeOfExpense;
import java.util.List;

/**
 *
 * @author Karlos
 */
public interface ITypeOfExpenseRepository {
     void save(TypeOfExpense Texp);
    
    List<TypeOfExpense> getAllTypeOfExpenses();  
}
