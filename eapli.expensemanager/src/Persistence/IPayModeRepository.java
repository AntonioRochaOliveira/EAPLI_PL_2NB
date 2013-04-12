/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Expense;
import Model.PayMode;

/**
 *
 * @author xiko
 */
public interface IPayModeRepository {
     void save(PayMode paymode);
}
