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
    private PayType payT;
    private String description;
    
    PayMode()
    {
        payT = new PayType();
        description = "Sem descrição";
    }
    
    PayMode(PayType p, String description)
    {
        payT = p;
        this.description = description;
    }

    /**
     * @return the payT
     */
    public PayType getPayT() {
        return payT;
    }

    /**
     * @param payT the payT to set
     */
    public void setPayT(PayType payT) {
        this.payT = payT;
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
    
    
}
