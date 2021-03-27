package sn.forage;

import sn.forage.controller.ClientController;

public class ServiceForage {
    public static void main(String[] args) {
        System.out.println("Initialisation application");
        ClientController clientController = new ClientController();
        clientController.process();
    }
}
