/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;


/**
 *
 * @author Márcio Martins
 */
@Entity
public class Expense extends Transaction implements Serializable{
      
    /**
	 * número de série da classe por defeito.
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private TypeOfExpense type;
    @ManyToOne(cascade = CascadeType.ALL)
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
    
    @Override
    public String toString(){
       String retorno = "";
       retorno += "Amount: "+super.getAmount()+"\n"
               + "Expense Date: "+super.getDate()+"\n"
               + "Expense Description: "+super.getDescription()+"\n"
               + "Expense Type: "+getType().shortName+"\n"
               + "Pay Mode: "+getPayM();
       return retorno;
    }
}
