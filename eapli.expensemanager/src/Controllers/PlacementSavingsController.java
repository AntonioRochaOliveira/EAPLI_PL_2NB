/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;

/**
 *
 * @author i111057
 */
public class PlacementSavingsController extends BaseController{
    public PlacementSavingsController()
    {
        
    }
    
    
    
    
    
    @Override
    public CheckingAccount buildCheckingAccount() {
		return new CheckingAccount();	
    }
}
