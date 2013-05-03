/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.CheckingAccount;
import Model.GeoZone;
import Persistence.GeoZoneRepository;

/**
 *
 * @author Fernando Silva/Fábio Mendonça
 */
public class GeoZoneController extends BaseController {

    GeoZoneRepository geoZoneRepo;

    public GeoZoneController() {

        geoZoneRepo = GeoZoneRepository.getInstance();
    }

    public void save(int id, String zone, String city) {

        geoZoneRepo.save(new GeoZone(id, zone, city));
    }

    @Override
    public CheckingAccount buildCheckingAccount() {
        return new CheckingAccount();
    }
}
