/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.GeoZone;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fernando Silva/Fábio Mendonça
 */
public class GeoZoneRepository {

    // class member
    private static GeoZoneRepository instance = null;
    private static List<GeoZone> listGeoZones;

    public static synchronized GeoZoneRepository getInstance() {

        if (instance == null) {
            instance = new GeoZoneRepository();
        }

        return instance;
    }

    public GeoZoneRepository() {
        listGeoZones = new ArrayList<GeoZone>();
    }

    public void save(GeoZone geoZone) {
        if (geoZone == null) {
            throw new IllegalArgumentException();
        }
        listGeoZones.add(geoZone);
    }

    public static List<GeoZone> getListGeoZones() {
        return listGeoZones;
    }
}
