/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.GeoZone;
import Persistence.GeoZoneRepository;

/**
 *
 * @author Fernando Silva/Fábio Mendonça
 */
public class GeoZoneController {    
    
    GeoZoneRepository geoZoneRepo;
    
    public GeoZoneController(){
        
        geoZoneRepo=GeoZoneRepository.getInstance();
    }
    
    public void save(String zone, String city){
        
        geoZoneRepo.save(new GeoZone(zone, city));
    }
    
}
