package Model;

import eapli.util.DateTime;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author jverde
 */
public class Income {

    private BigDecimal amount;
    private IncomeType incomeType;
    private String description;
    private Date dateOccurred;

    public Income() {
    }

    public Income(BigDecimal amount, IncomeType incomeType, String description, Date dateOccurred) {
        this.amount = amount;
        this.incomeType = incomeType;
        this.description = description;
        this.dateOccurred = dateOccurred;
    }

	public BigDecimal getAmount() {
		return amount;
	}
}

