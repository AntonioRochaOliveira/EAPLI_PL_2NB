package Model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExpensesLimits implements Serializable {
    /*
     * Campo necessário para a correta serialização da classe.
     * (serve para saber se a versão serializada é compatível,
     * no momento da leitura.
     */

    private static final long serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private int id;
    @Column(name = "LIMITTYPE")
    private String limitType;
    @Column(name = "LIMITVALUE")
    private BigDecimal limitValue;

    //construtor sem parametros para o JPA.
    protected ExpensesLimits() {
    }

    public ExpensesLimits(String limitType, BigDecimal limitValue) {
        this.limitType = limitType;
        this.limitValue = limitValue;
    }

    public int getId() {
        return id;
    }

    public String getLimitType() {
        return limitType;
    }

    public BigDecimal getLimitValue() {
        return limitValue;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public void setLimitValue(BigDecimal limitValue) {
        this.limitValue = limitValue;
    }
}
