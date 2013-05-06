/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Map;

/**
 *
 * @author Miguel Ribeiro
 */
public class PayMode {
    //class member
    private PaymentType payT;
    private Map<String, Object> aditionalInformation;
    
    public PayMode(PaymentType paymentType,Map<String, Object> aditionalInformation)
    {
       payT=paymentType;
       this.aditionalInformation=aditionalInformation;
    }

    PayMode() {
        
    }
    
    public String getPaymentTypeName() {
        return payT.getName();
    }

    @Override
    public String toString() {
         StringBuilder temp=new StringBuilder();
         temp.append(payT.name);

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
