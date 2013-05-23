/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.Collection;

import Model.PayMode;

/**
 *
 * @author xiko
 */
public interface IPayModeRepository {
     PayMode save(PayMode paymode);
     void delete(PayMode payMode);
     long size();    
     Collection<PayMode> findAll();
}
