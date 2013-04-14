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


public class TypeOfExpenseRepository implements ITypeOfExpenseRepository {

    private static TypeOfExpenseRepository uniqueInstance=null;
    
    public static TypeOfExpenseRepository instance(){
        if (uniqueInstance==null){
            uniqueInstance = new TypeOfExpenseRepository();
        }
        return uniqueInstance;
    }

    
    
     // class member
    private static List<TypeOfExpense> listTExpense = new ArrayList<TypeOfExpense>();

    /**
     * @return the listTExpense
     */
     public List<TypeOfExpense> getListTExpense() {
        return listTExpense;
    }
     
    @Override
    public void save(TypeOfExpense Texp) {
        if (Texp == null) {
            throw new IllegalArgumentException();
        }
        getListTExpense().add(Texp);
    }

    @Override
    public List<TypeOfExpense> getAllTypeOfExpenses() {
        return listTExpense;
    }
}
