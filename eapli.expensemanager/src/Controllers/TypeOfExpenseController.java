package Controllers;

import Model.TypeOfExpense;
import Persistence.PersistenceFactory;
import Persistence.TypeOfExpenseRepository;

public class TypeOfExpenseController {
    
    public TypeOfExpenseController(){
    }
    
    public void TypeOfExpense(String description, String shortName) {
        //ToDo... need 2 inputs
        TypeOfExpense Texpense = new TypeOfExpense( description, shortName);
       // TypeOfExpenseRepository repoToE = new TypeOfExpenseRepository();
        TypeOfExpenseRepository repoToE = PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository();

        repoToE.save(Texpense);
    }
 
}