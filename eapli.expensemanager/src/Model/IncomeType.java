package Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IncomeType implements Serializable{
	/*
	 * Campo necessário para a correta serialização da classe.
	 * (serve para saber se a versão serializada é compatível,
	 * no momento da leitura.
	 */
	private static final long serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Name")
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
    
    @Override
    public boolean equals(Object other){
    	if (!(other instanceof IncomeType)) return false;
    	
    	IncomeType otherIncomeType = (IncomeType) other;
    	
    	if (this.id != otherIncomeType.id) return false;    	
    	if (!this.name.equals(otherIncomeType.name)) return false;    	
    	if (!this.description.equals(otherIncomeType.description)) return false;
    	
		return true;
    }
}
