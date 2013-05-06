/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PayMode;
import java.util.List;

/**
 *
 * @author xiko
 */
public interface IPayModeRepository {
     PayMode save(PayMode paymode);
     void delete(PayMode payMode);
     long size();    
     List<PayMode> all();
}
