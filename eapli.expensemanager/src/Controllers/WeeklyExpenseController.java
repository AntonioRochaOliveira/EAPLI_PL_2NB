package Controllers;


import Model.CheckingAccount;

/**
 *
 * @author Paulo Mendes
 * @author Sérgio Castro
 */
public class WeeklyExpenseController extends BaseController {

    public WeeklyExpenseController() {
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
    
}