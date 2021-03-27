package sn.forage.service.console;


import sn.forage.domain.Abonnement;
import sn.forage.domain.Village;
import sn.forage.repository.AbonnementRepository;
import sn.forage.repository.VillageRepository;
import sn.forage.service.DisplayService;
import sn.forage.service.MenuService;

import java.util.Scanner;

public class ScannerMenuService implements MenuService {
    private final DisplayService displayService;
    private final Scanner scanner;
    private final VillageRepository villageRepository;
    private final AbonnementRepository abonnementRepository;

    public ScannerMenuService(DisplayService displayService, VillageRepository villageRepository, AbonnementRepository abonnementRepository) {
        this.displayService = displayService;
        this.villageRepository = villageRepository;
        this.scanner = new Scanner(System.in);
        this.abonnementRepository = abonnementRepository;
    }


    private String lireChoix() {
        return scanner.next();
    }

    private void afficherMenu( String choix) {
        Village villages = VillageRepository.getAll();
        if("l".equalsIgnoreCase(choix)){
            displayService.afficherListeServices(villages);
            int idPrestation = scanner.nextInt();

            //get prestation by id
            Village prestation = VillageRepository.getById(idPrestation);
            //get prestataires by prestation
            Abonnement[] abonnements = AbonnementRepository.getAllByVillage(villages);
            //afficher les prestataires qui fournissent ce service
            displayService.afficherAbonnements(villages,abonnements );

            int idAbonnement = scanner.nextInt();
            Abonnement abonnement = AbonnementRepository.findById(idAbonnement);
            if(2 == idAbonnement){
                displayService.afficherDetailsConsommation();

                int idConsommation = scanner.nextInt();
                if(3 == idConsommation){
                    displayService.afficherConsommation();
                    displayService.afficherDemandeHeure();
                    String heure = scanner.next();
                    displayService.afficherConfirmation(heure);
                }
            }
        }
        //afficher le menu inconnu
        else {
            displayService.afficherOptionInconnue();
        }
    }

    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
}
