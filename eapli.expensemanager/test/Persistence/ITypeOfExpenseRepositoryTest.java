/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.TypeOfExpense;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Karlos
 */
public class ITypeOfExpenseRepositoryTest {
    
    public ITypeOfExpenseRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class ITypeOfExpenseRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        TypeOfExpense Texp = null;
        ITypeOfExpenseRepository instance = new ITypeOfExpenseRepositoryImpl();
        instance.save(Texp);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    private static List<TypeOfExpense> listTExpense = new ArrayList<TypeOfExpense>();
    public class ITypeOfExpenseRepositoryImpl implements ITypeOfExpenseRepository {

        
        /**
         *
         * @param Texp
         */
        @Override
        public void save(TypeOfExpense Texp) {
        }

        @Override
        public List<TypeOfExpense> getAllTypeOfExpenses() {
            return listTExpense;
        }
    }
}