package Controllers;

import Model.TypeOfExpense;
import Persistence.*;

public class TypeOfExpenseController {
    
    public TypeOfExpenseController(){
    }
    
    public void TypeOfExpense(String description) {
        TypeOfExpense Texpense = new TypeOfExpense( description);
        ExpenseRepository repoToE = new ExpenseRepository();
        repoToE.save(Texpense);
    }
 
}