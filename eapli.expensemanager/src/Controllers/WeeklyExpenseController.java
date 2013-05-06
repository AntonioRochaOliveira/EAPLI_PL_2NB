package Controllers;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.CheckingAccount;


/**
 *
 * @author Paulo Mendes
 * @author Sérgio Castro
 */
public class WeeklyExpenseController extends BaseController{

    public WeeklyExpenseController() {
    }
   
    
    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}