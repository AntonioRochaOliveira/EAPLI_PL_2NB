/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.Column;
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

	/**
	 * número de série da classe por defeito.
	 */
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue
    private int id;
    
    @Column(unique=true)
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

    @Override
    public boolean equals(Object obj) {
       if (!(obj instanceof PaymentType))
        {
            return false;
        }
        
        PaymentType p = (PaymentType) obj;
        if (p.aditionalInformationNames.equals(aditionalInformationNames) && p.name.equals(name))
        {
            return true;
        }
        return false;
    }
     
}
