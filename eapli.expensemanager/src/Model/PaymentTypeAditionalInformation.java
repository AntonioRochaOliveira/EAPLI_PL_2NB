/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author xiko
 */
public class PaymentTypeAditionalInformation {
    Map<String, Object> aditionalInformation = new HashMap<String, Object>();

    public PaymentTypeAditionalInformation() {
    }
    
    public void put(String key, Object value)
    {
    aditionalInformation.put(key, value);
    }

    @Override
    public String toString() {
        StringBuilder temp=new StringBuilder();
        for (String key : aditionalInformation.keySet())
            {
            temp.append("\n\t")
                .append(key)
                .append(" - ")
                .append(aditionalInformation.get(key))
                .append("\n");
            }
        return temp.toString();
    }    
}
