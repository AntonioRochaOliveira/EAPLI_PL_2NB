/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.TypeOfExpense;
import Persistence.TypeOfExpenseRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

/**
 *
 * @author arocha
 */
public class TypeOfExpenseRepositoryImpl extends JpaRepository<TypeOfExpense, String> implements TypeOfExpenseRepository {

    public TypeOfExpense findOrCreate(String key, String description) {
        if (key == null || key.trim().length() == 0) {
            throw new IllegalArgumentException();
        }

        EntityManager em = getEntityManager();
        assert em != null;

        TypeOfExpense expenseType;
        Query q = em.createQuery("SELECT et FROM ExpenseType et WHERE et.id = :type").setParameter("type", key);
        try {
            expenseType = (TypeOfExpense) q.getSingleResult();
        } catch (NoResultException ex) {
            expenseType = new TypeOfExpense(key, description);
            save(expenseType);
        }
        return expenseType;
    }

//    @Override
//    public ExpenseType findForName(String key) {
//        return super.read(key);
//    }
    @Override
    public List<TypeOfExpense> getListTExpense() {
        // ToDo
        return super.all();

//        TypeOfExpense tE = new TypeOfExpense("", "");
//        List<TypeOfExpense> lista = getListTExpense();
//
//        int type;/* Index of type expense */
//        if (lista.size() > 0) {
//            for (int i = 0; i < lista.size(); i++) {
//                System.out.println(i + 1 + ":" + lista.get(i));
//            }
//        }
//        type = Console.readInteger("Option:");
//        if (type == 0) //If the user wishes to create a new
//        {
//        } else {
//            tE = lista.get(type - 1);
//        }
//
//        return lista;
    }
//        public List<TypeOfExpense> getAllTypeOfExpenses() {
//         // ToDo
//            return super.all();
//        }
}
