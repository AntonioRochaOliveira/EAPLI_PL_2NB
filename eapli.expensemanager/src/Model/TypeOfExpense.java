package Model;

public class TypeOfExpense {

    String description;

    protected TypeOfExpense() {
    }

    public TypeOfExpense(String description) {
        if (description == null) {
            throw new IllegalArgumentException();
        }
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
   
}
