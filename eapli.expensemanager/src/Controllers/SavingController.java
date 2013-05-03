/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.math.BigDecimal;

import Model.CheckingAccount;
import Model.Saving;
import Persistence.SavingRepository;

/**
 *
 * @author João
 */
public class SavingController extends BaseController{
    
    public SavingController(){
        
    }
    
    public void registerSaving(BigDecimal amount, String description){
        Saving sav = new Saving(amount, description);
        SavingRepository repoSav = new SavingRepository();
        repoSav.save(sav);
        
    }
    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
    
}
