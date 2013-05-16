package Model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExpensesLimits implements Serializable{
	/*
	 * Campo necessário para a correta serialização da classe.
	 * (serve para saber se a versão serializada é compatível,
	 * no momento da leitura.
	 */
	private static final long serialVersionUID = 1;
	
	@Id	
	@Column(name="id")
        private int id;
	private String limitType;
        private BigDecimal limitValue;
	
	//construtor sem parametros para o JPA.
	protected ExpensesLimits() { }
	
	public ExpensesLimits(String limit, String description) {
		
	}
/*
    public String getDescription() {
        
    }

    public String getLimit() {
        return limit;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }
 */   
}
