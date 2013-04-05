/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.TypeOfExpense;
import Persistence.*;
/**
 *
 * @author Karlos
 */
public class TypeOfExpenseController {
    public TypeOfExpenseController(){
}
    
    public void TypeOfExpense(String description) {
        TypeOfExpense Texpense = new TypeOfExpense( description);
        ExpenseRepository repoToE = new ExpenseRepository();
        repoToE.save(Texpense);
        
    }
    
    
    
}