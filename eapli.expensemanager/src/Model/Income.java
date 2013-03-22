<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Joana
 */
public class Income {
    
}
=======
package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jverde
 */
public class Income {
        private BigDecimal amount;
        private IncomeType incomeType;
        private String description;
        private Date dateOccurred;
        
    
        protected Income() {}

    
        protected Income(BigDecimal amount, IncomeType incomeType, String description,  Date dateOccurred) {
            this.amount = amount; 
            this.incomeType = incomeType;
            this.description = description;
            this.dateOccurred = dateOccurred;
        }
    

}
>>>>>>> 9292ff9c82c66c0ae68f565702e46b7769af1b3f
