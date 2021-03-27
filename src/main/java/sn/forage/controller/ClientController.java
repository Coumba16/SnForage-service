package sn.forage.controller;

import sn.forage.repository.AbonnementRepository;
import sn.forage.repository.ConsommationRepository;
import sn.forage.repository.VillageRepository;
import sn.forage.repository.jdbc.DataSource;
import sn.forage.repository.jdbc.JdbcBasedAbonnementRepository;
import sn.forage.repository.jdbc.JdbcBasedVillageRepository;
import sn.forage.repository.jdbc.MysqlDataSource;
import sn.forage.repository.ram.ArrayBasedConsommationRepository;
import sn.forage.repository.ram.ListBasedAbonnementRepository;
import sn.forage.service.DisplayService;
import sn.forage.service.MenuService;
import sn.forage.service.console.ConsoleDisplayService;
import sn.forage.service.console.ScannerMenuService;

public class ClientController {
    private final DisplayService displayService ;
    private final MenuService scannerMenuService ;

    public ClientController(DisplayService displayService, MenuService scannerMenuService) {
        this.displayService = displayService;
        this.scannerMenuService = scannerMenuService;
    }

    public ClientController(){
        ConsommationRepository consommationRepository = new ArrayBasedConsommationRepository();
        DataSource dataSource = new MysqlDataSource();
        displayService = new ConsoleDisplayService(consommationRepository);
        VillageRepository villageRepository = new JdbcBasedVillageRepository(dataSource);
        AbonnementRepository abonnementRepository = new ListBasedAbonnementRepository();
        scannerMenuService = new ScannerMenuService(displayService, villageRepository, abonnementRepository );
    }

    public void process(){

        displayService.afficherBienvenu();
        displayService.afficherMenuPrincipal();
        scannerMenuService.afficherMenu();
    }
}
