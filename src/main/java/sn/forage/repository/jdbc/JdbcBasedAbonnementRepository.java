package sn.forage.repository.jdbc;

import sn.forage.domain.Abonnement;
import sn.forage.domain.Village;
import sn.forage.repository.AbonnementRepository;

public class JdbcBasedAbonnementRepository implements AbonnementRepository {
    public Abonnement[] getAllByVillage(Village village) {
        return new Abonnement[0];
    }

    public Village[] findById(int idAbonnement) {
        return new Village[0];
    }
}
