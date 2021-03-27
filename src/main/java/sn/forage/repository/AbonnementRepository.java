package sn.forage.repository;

import sn.forage.domain.Abonnement;
import sn.forage.domain.Village;

public interface AbonnementRepository {
    static Abonnement[] getAllByVillage(Village village) {
        return new Abonnement[0];
    }

    static Abonnement findById(int idAbonnement) {
        return null;
    }
}
