/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.Expense;
import Persistence.ExpenseRepository;

/**
 *
 * @author Márcio
 */
public class ExpenseRepositoryImpl extends JpaRepository<Expense, String> implements ExpenseRepository{
    
}
