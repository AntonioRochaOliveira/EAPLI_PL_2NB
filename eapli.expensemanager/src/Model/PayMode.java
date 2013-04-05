/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Miguel Ribeiro
 */
public class PayMode {
    //class member
    private PaymentType payT;
    private String description;
    private long number;
    
    PayMode()
    {
        payT = new PaymentType();
        description = "Sem descrição";
    }
    
    PayMode(PaymentType p, String description)
    {
        payT = p;
        this.description = description;
    }

    /**
     * @return the payT
     */
    public PaymentType getPayT() {
        return payT;
    }

    /**
     * @param payT the payT to set
     */
    public void setPayT(PaymentType payT) {
        this.payT = payT;
    }

    public void setNumber(int number){
        this.number = number;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
    public long getNumber(){
        return number;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
