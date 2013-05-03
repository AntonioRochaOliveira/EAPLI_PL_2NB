/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.GeoZoneController;
import eapli.util.Console;

/**
 *
 * @author Janus
 */
public class GeoZoneRegisterUI{
    
    
    GeoZoneController controller;
    
    public GeoZoneRegisterUI(){
        
        controller= new GeoZoneController();
        registerZone();
    }

    public void registerZone() {
        
        int id = Console.readInteger("Insert Id:");
        String zone=Console.readLine("Insert Continent:");
        
        String city=Console.readLine("Insert City");
        
        controller.save(id, zone, city);
    }
    
}
