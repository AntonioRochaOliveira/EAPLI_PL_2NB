/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;


/**
 *
 * @author Márcio
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Transaction implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTransaction;
    @Column(name="AMOUNT")
    private BigDecimal amount;
    @Column(name="DATEEXPENSE")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateExpense;
    @Column(name="DESCRIPTION")
    private String description; 
    
    public Transaction()
    {  
    }
    public Transaction(BigDecimal amBigDecimal, Date date, String deString)
    {
        amount = amBigDecimal;
        this.dateExpense = date;
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
        return dateExpense;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.dateExpense = date;
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

    /**
     * @return the idTransaction
     */
    public int getIdTransaction() {
        return idTransaction;
    }
    
}
