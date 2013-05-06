/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;

/**
 *
 * @author sdcastro
 */
public class NotificationsController extends BaseController{
    public NotificationsController() {
    }
   
    
    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
