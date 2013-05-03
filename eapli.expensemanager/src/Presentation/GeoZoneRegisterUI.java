/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.GeoZoneController;
import eapli.util.Console;

/**
 *
 * @author Fernando Silva/Fábio Mendonça
 */
public class GeoZoneRegisterUI extends BaseUI {

    GeoZoneController controller;

    public GeoZoneRegisterUI() {

        controller = new GeoZoneController();
        showContent();
    }

    public GeoZoneController buildBaseController() {

        return controller;
    }

    @Override
    public void showContent() {

        int id = Console.readInteger("Insert Id:");

        String zone = Console.readLine("Insert Continent:");

        String city = Console.readLine("Insert City");

        controller.save(id, zone, city);
    }

    @Override
    public String getTitle() {
        return "GEOGRAPHIC ZONE REGISTER";
    }
}
