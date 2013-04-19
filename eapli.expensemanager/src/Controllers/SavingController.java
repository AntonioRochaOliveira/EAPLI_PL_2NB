/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import Model.Saving;
import java.math.BigDecimal;

/**
 *
 * @author João
 */
public class SavingController extends BaseController{
    
    public SavingController(){
        
    }
    
    public void Saving(BigDecimal amount, String description){
        Saving sav = new Saving(amount, description);
        SavingREpository repoSav = new SavingRepository();
        repoSav.save(sav);
        
    }
    @Override
    public CheckingAccount buildCheckingAccount() {
        
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
