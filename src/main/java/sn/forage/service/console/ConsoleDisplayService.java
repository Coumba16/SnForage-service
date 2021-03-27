package sn.forage.service.console;

import sn.forage.domain.Abonnement;
import sn.forage.domain.Consommation;
import sn.forage.domain.Village;
import sn.forage.repository.ConsommationRepository;
import sn.forage.service.DisplayService;


public class ConsoleDisplayService implements DisplayService {

private final ConsommationRepository consommationRepository;

    public ConsoleDisplayService(ConsommationRepository consommationRepository) {
        this.consommationRepository = consommationRepository;
    }

    @Override
    public void afficherBienvenu() {
        System.out.println("Bienvenu sur la plateforme service à la demande!");

    }

    @Override
    public void afficherMenuPrincipal() {
        System.out.println("> l pour lister les services disponibles ");
    }

    @Override
    public void afficherListeServices(Village villages) {

    }

    @Override
    public void afficherListeServices(Village[] villages) {
        System.out.println("Les services disponibles sont:");
        for (int i = 0; i < villages.length; i++) {
            Village village = villages[i];
            System.out.println(String.format("> %s %s %s", village.getId(), village.getNom(), village.getLibelle()));
        }

    }

    @Override
    public void afficherAbonnements(Village village, Abonnement[] abonnements) {
        System.out.println(String.format("La liste des prestataires %s :", village.getNom()));
        for (int i = 0; i < abonnements.length; i++) {
            Abonnement abonnement = abonnements[i];
            System.out.println(String.format("> %s %s %s", abonnement.getId(), abonnement.getNumero(),abonnement.getDate(), abonnement.getDescription()));
        }

    }

    @Override
    public void afficherConsommation() {
        System.out.println("Les détails consommation de Adja Sene : ");
        Consommation[] consommations = ConsommationRepository.getAll();
        for (int i = 0; i <consommations.length; i++) {
            Consommation consommation = consommations[i];
            System.out.println(
                    String.format(
                            "> %s %s %s: %s",
                            consommation.getId(),
                            consommation.getNombreLitre(),
                            consommation.getPrix(),
                            consommation.getDate()
                    )
            );
        }
    }

    @Override
    public void afficherDetailsConsommation() {
        System.out.println("Consommation adja Sene: nombre de litre utilisé 2500 ");
    }

    @Override
    public void afficherDemandeHeure() {
        System.out.println("Quelle heure voulez-vous (hh:mm) ?");
    }

    @Override
    public void afficherConfirmation(String heure) {
        System.out.println(String.format("OK pour %s", heure));
    }

    @Override
    public void afficherOptionInconnue() {
        System.out.println("Choix inconnu");

    }
}
