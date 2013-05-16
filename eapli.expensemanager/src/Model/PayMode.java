/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Miguel Ribeiro
 */
@Entity
@Table(name = "paymentMode")
public class PayMode implements Serializable {
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
       this.aditionalInformation=new HashMap(aditionalInformation);
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
}
