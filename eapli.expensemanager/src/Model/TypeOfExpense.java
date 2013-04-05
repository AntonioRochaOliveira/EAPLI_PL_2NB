/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Karlos
 */

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

   
}
