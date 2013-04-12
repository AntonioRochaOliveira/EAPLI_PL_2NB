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

public class Expense {
    
    
    private BigDecimal amount;
    private TypeOfExpense type;
    private Date date;
    private PayMode payM;
    private String comment; 
   
    protected Expense() {}
    
    public Expense(BigDecimal amount, TypeOfExpense type, Date date, PayMode payM, String comment)
    {
        setAmount(amount);
        setType(type);
        setDate(date);
        setPayM(payM);
        setComment(comment);
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

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    @Override
    public String toString()
    {
        return "Valor: "+amount.toString()+" Comentário: "+comment.toString(); //Incompleto
    }
}
