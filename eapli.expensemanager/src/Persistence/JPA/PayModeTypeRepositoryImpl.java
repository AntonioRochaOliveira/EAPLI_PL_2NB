/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.JPA;

import Model.PayMode;
import Persistence.IPayModeRepository;

/**
 *
 * @author xiko
 */
public class PayModeTypeRepositoryImpl  extends JpaRepository<PayMode,Integer> implements IPayModeRepository{
}
