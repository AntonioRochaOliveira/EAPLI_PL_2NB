/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author xiko
 */
public class PaymentType {
    
    String name;
    PaymentTypeAditionalInformation aditionalInformation;
    
    public PaymentType(String name) {
        this.name=name;
        aditionalInformation=null;
    }

    public PaymentType(String name, PaymentTypeAditionalInformation aditionalInformation) {
        this.name = name;
        this.aditionalInformation = aditionalInformation;
    }

    @Override
    public String toString() {
        return   name +  ((aditionalInformation != null)?aditionalInformation:"");
    }
    
    
    
}
