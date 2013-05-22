/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Properties;

/**
 *
 * @author sdcastro
 */
public class NotificationsController extends BaseController {

    public NotificationsController() {
    }

    /* NOT USED
     * 
     
     public BigDecimal getWeekLimit() {
     Properties prop = new Properties();

     String fileName = "config/limits.properties";
     BigDecimal weekLimit;

     try {
     //load a properties file
     prop.load(new FileInputStream(fileName));

     //get the property value
     System.out.println();
     weekLimit = new BigDecimal(prop.getProperty("weekly"));

     } catch (Exception ex) {
     weekLimit = BigDecimal.ZERO;
     }

     return weekLimit;                
     }
     * */
    
    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
