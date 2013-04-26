/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Saving;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João
 */
public class SavingRepository {
    
     private static List<Saving> listESaving = new ArrayList<Saving>();
    
    public List<Saving> getListSaving() {
        return listESaving;
    }
    
    public void save(Saving sav) {
        if (sav == null) {
            throw new IllegalArgumentException();
        }
        getListSaving().add(sav);

    }    
}
