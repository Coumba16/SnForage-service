package sn.forage.service;

import sn.forage.domain.Abonnement;
import sn.forage.domain.Village;

public interface DisplayService {
    void afficherBienvenu();

    void afficherMenuPrincipal();

    void afficherListeServices(Village villages);

    void afficherListeServices(Village[] villages);

    void afficherAbonnements(Village village, Abonnement[] abonnements);

    void afficherConsommation();

    void afficherDetailsConsommation();

    void afficherDemandeHeure();

    void afficherConfirmation(String heure);

    void afficherOptionInconnue();
}
