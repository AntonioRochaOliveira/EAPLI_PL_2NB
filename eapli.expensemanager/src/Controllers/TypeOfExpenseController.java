package Controllers;

import Model.TypeOfExpense;
import Persistence.*;

public class TypeOfExpenseController {
    
    public TypeOfExpenseController(){
    }
    
    public void TypeOfExpense(String description) {
        //ToDo... need 2 inputs
        TypeOfExpense Texpense = new TypeOfExpense( description, description);
       // TypeOfExpenseRepository repoToE = new TypeOfExpenseRepository();
        TypeOfExpenseRepository repoToE = PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository();

        repoToE.save(Texpense);
    }
 
}