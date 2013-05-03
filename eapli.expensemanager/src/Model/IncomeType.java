package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class IncomeType {
	@Id
	private String name;
	@Column(name="Description")
	private String description;
	
	//construtor sem parametros para o JPA.
	protected IncomeType() { }
	
	public IncomeType(String name, String description) {
		this.name = name;
		this.description = description;
	}

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
