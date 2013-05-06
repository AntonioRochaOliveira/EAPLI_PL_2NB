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
import javax.persistence.Table;

/**
 *
 * @author xiko
 */
@Entity
@Table(name = "paymentType")
public class PaymentType implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    
    @Lob	
    HashMap<String, String> aditionalInformationNames;

    public PaymentType(String name) {
        this.aditionalInformationNames = new HashMap<String, String>();
        this.name = name;
    }

    public PaymentType() {
        this.aditionalInformationNames = new HashMap<String, String>();

    }

    public void addAditionalInformationName(String key, String value) {
        aditionalInformationNames.put(key, value);
    }

    public Map<String, String> getAditionalInformationNames() {
        return aditionalInformationNames;
    }

    public String getName() {
        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
     @Override
    public String toString() {
         StringBuilder temp=new StringBuilder();
         temp.append(name);

        for (String key : aditionalInformationNames.keySet())
            {
            temp.append("| ")
                .append(key)
                .append(" ")
                .append(aditionalInformationNames.get(key))
                .append(" |");
            }
        return temp.toString(); 
    } 
}
