/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;

/**
 *
 * @author Janus
 */
public class BalanceUI extends BaseUI{

    BalanceController controller=null;
    
    public BalanceUI(){
        
        
        controller=new BalanceController();
    }
    
    @Override
    public BaseController buildBaseController() {
        return controller;
    }
    
    @Override
    public String getTitle(){
        
        return "Current Balance";
    }
    
    @Override
    public void showContent(){
        
        
    }
    
}
