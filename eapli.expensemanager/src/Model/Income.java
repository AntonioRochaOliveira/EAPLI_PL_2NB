package Model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author jverde | Joel Ferreira
 */

@Entity
public class Income extends Transaction {

    @ManyToOne(cascade = CascadeType.ALL)
    @Column(name="IncomeType")
    private IncomeType incomeType;
    @Column(name="dateOccurred")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOccurred;

    public Income()  {
    }

    public Income(BigDecimal amount, IncomeType incomeType, String description, Date dateOccurred) {
        super(amount, dateOccurred, description);
        this.incomeType = incomeType;
    }

    public Date getDateOccurred() {
        return dateOccurred;
    }

    public IncomeType getIncomeType() {
        return incomeType;
    }

    public void setDateOccurred(Date dateOccurred) {
        this.dateOccurred = dateOccurred;
    }

    public void setIncomeType(IncomeType incomeType) {
        this.incomeType = incomeType;
    }
}

