/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author Márcio Martins
 */

public class Expense extends Transaction{
    
    
    
    private TypeOfExpense type;
    private PayMode payM;
    
   
    protected Expense() {}
    
    public Expense(BigDecimal amount, TypeOfExpense type, Date date, PayMode payM, String description)
    {
        
       super(amount,date,description);
       this.type = type;
       this.payM = payM;
    }
    
    /**
     * @return the type
     */
    public TypeOfExpense getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(TypeOfExpense type) {
        this.type = type;
    }

    /**
     * @return the payM
     */
    public PayMode getPayM() {
        return payM;
    }

    /**
     * @param payM the payM to set
     */
    public void setPayM(PayMode payM) {
        this.payM = payM;
    }
}
