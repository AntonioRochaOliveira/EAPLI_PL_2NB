package Controllers;

import Model.CheckingAccount;
import Model.TypeOfExpense;
import Persistence.PersistenceFactory;
import Persistence.TypeOfExpenseRepository;

public class TypeOfExpenseController extends BaseController {
    
    public TypeOfExpenseController(){
    }
    
    public void TypeOfExpense(String description, String shortName) {
        //ToDo... need 2 inputs
        TypeOfExpense Texpense = new TypeOfExpense( description, shortName);
       // TypeOfExpenseRepository repoToE = new TypeOfExpenseRepository();
        TypeOfExpenseRepository repoToE = PersistenceFactory.buildPersistenceFactory().TypeOfExpenseRepository();

        repoToE.save(Texpense);
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
 
}