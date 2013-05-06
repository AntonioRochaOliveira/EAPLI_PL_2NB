/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author xiko
 */
public class PaymentType {

    String name;
    Map<String,String>aditionalInformationNames;
    
    public PaymentType(String name) {
        this.aditionalInformationNames = new HashMap<String,String>();
        this.name = name;
    }
    
    public PaymentType(){
        this.aditionalInformationNames = new HashMap<String,String>();
        
    }

    public void addAditionalInformationName(String key,String value) {
        aditionalInformationNames.put(key,value);
    }

    public Map<String, String> getAditionalInformationNames() {
        return aditionalInformationNames;
    }

    public String getName() {
        return name;
    }
}
