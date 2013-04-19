/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Márcio
 */
public abstract class Transaction {
    private BigDecimal amount;
    private Date date;
    private String description; 
    
    public Transaction()
    {  
    }
    public Transaction(BigDecimal amBigDecimal, Date date, String deString)
    {
        amount = amBigDecimal;
        this.date = date;
        description = deString;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
