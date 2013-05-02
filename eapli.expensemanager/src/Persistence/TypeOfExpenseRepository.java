/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.TypeOfExpense;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Karlos
 */


public interface TypeOfExpenseRepository {

    public List<TypeOfExpense> getListTExpense() ;
    public TypeOfExpense save(TypeOfExpense Texp) ;
    public List<TypeOfExpense> getAllTypeOfExpenses();

}
