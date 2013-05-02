package Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TypeOfExpense implements Serializable  {
    @Id
     String shortName;
     String description;;

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
   
}
