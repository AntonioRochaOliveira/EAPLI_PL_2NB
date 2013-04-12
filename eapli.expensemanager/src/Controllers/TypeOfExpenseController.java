package Controllers;

import Model.TypeOfExpense;
import Persistence.*;

public class TypeOfExpenseController {
    
    public TypeOfExpenseController(){
    }
    
    public void TypeOfExpense(String description) {
        TypeOfExpense Texpense = new TypeOfExpense( description);
        TypeOfExpenseRepository repoToE = new TypeOfExpenseRepository();
        repoToE.save(Texpense);
    }
 
}