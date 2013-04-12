package Model;

public class TypeOfExpense {

    private String description;

    protected TypeOfExpense() {
    }

    public TypeOfExpense(String description) {
        if (description == null) {
            throw new IllegalArgumentException();
        }
        this.description = description;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
   
    @Override
    public String toString()
    {
        return "Tipo de Despesa: "+getDescription();
    }
}
