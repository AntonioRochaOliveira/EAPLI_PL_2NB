/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;
import java.util.ArrayList;
import java.util.List;

import Model.TypeOfExpense;
import Persistence.TypeOfExpenseRepository;

/**
 *
 * @author arocha
 */
public class TypeOfExpenseRepositoryImpl implements TypeOfExpenseRepository {
    private static TypeOfExpenseRepository uniqueInstance=null;
    
    private TypeOfExpenseRepositoryImpl(){}
    
    public static TypeOfExpenseRepository instance(){
        if (uniqueInstance==null){
            uniqueInstance = new TypeOfExpenseRepositoryImpl();
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
    public TypeOfExpense save(TypeOfExpense Texp) {
        //Todo...
        if (Texp == null) {
            throw new IllegalArgumentException();
        }
        getListTExpense().add(Texp);
        return Texp;
    }

//    @Override
//    public List<TypeOfExpense> getAllTypeOfExpenses() {
//        return listTExpense;
//    }
}