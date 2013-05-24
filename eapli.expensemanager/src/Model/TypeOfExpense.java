package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TypeOfExpense implements Serializable  {
	/**
	 * número de série da classe por defeito.
	 */
	private static final long serialVersionUID = 1L;
	 
	@Id
     String shortName;
    @Column(name="Description")
     String description;
    
   
    protected TypeOfExpense() {
    }

    public TypeOfExpense(String shortName, String description) {
        if (description == null || shortName==null) {
            throw new IllegalArgumentException();
        }
        this.description = description;
        this.shortName = shortName;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
   
    public String getShortName() {
        return shortName;
    }
    
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
