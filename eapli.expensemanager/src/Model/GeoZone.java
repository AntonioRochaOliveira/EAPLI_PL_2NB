/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fernando Silva/Fábio Mendonça
 */
@Entity
@Table(name="GEOZONE")
public class GeoZone {
    @Id
    @Column(name="ID")
    private int id;
    @Column(name="CONTINENT")    
    private String zone;
    @Column(name="CITY")
    private String city;
    
    public GeoZone(){                
    }
    
    public GeoZone(int id, String zone, String city){
        this.id=id;
        this.zone=zone;
        this.city=city;
    }
    
}
