/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Miguel Ribeiro
 */
@Entity
@Table(name = "paymentMode")
public class PayMode implements Serializable {
	
	/**
	 * número de série da classe por defeito.
	 */
	private static final long serialVersionUID = 1L;
	
    //class member
    @Id
    @GeneratedValue
    private int id;
    
    @ManyToOne
    private PaymentType payT;
    
    @Lob
    private HashMap<String, Object> aditionalInformation;
    
    public PayMode(PaymentType paymentType,Map<String, Object> aditionalInformation)
    {
       payT=paymentType;
       this.aditionalInformation=new HashMap<String, Object>(aditionalInformation);
    }

   public PayMode() {
        
    }
    
    public String getPaymentTypeName() {
        return payT.getName();
    }

    @Override
    public String toString() {
         StringBuilder temp=new StringBuilder();
         temp.append(payT.getName());

        for (String key : aditionalInformation.keySet())
            {
            temp.append("| ")
                .append(key)
                .append(" ")
                .append(aditionalInformation.get(key))
                .append(" |");
            }
        return temp.toString(); 
    } 

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof PayMode))
        {
            return false;
        }
        
        PayMode p = (PayMode) obj;
        if (p.payT.equals(payT) && p.aditionalInformation.equals(aditionalInformation))
        {
            return true;
        }
        return false;
    }    
}
