/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.InMemory;

import Model.CheckingAccount;
import Persistence.CheckingAccountRepository;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author i111057
 */
public class CheckingAccountImpl implements CheckingAccountRepository {

    private static CheckingAccountImpl instance = null;
    private BigDecimal initial;

    protected CheckingAccountImpl() {
        initial = new BigDecimal(0);
    }

    public static CheckingAccountImpl instance() {
        if (instance == null) {
            instance = new CheckingAccountImpl();
            return instance;
        }

        return instance;
    }

    @Override
    public BigDecimal getValue() {
        return instance.initial;
    }

    @Override
    public CheckingAccount save(CheckingAccount ChAc) {
        instance.initial = ChAc.getValue();
        return ChAc;
    }
}
