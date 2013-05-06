package Model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jverde
 */
public class Income extends Transaction {

    private IncomeType incomeType;
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

