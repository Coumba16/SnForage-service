package sn.forage.repository.ram;

import sn.forage.domain.Abonnement;
import sn.forage.domain.Village;
import sn.forage.repository.AbonnementRepository;

import java.util.ArrayList;
import java.util.List;

public class ListBasedAbonnementRepository implements AbonnementRepository {
   private final List<Village> villages;

    public ListBasedAbonnementRepository() {
        this.villages = new ArrayList<Village>();
    }

    public Abonnement[] getAllByVillage(Village village) {
        return new Abonnement[0];
    }

    public Village[] findById(int idAbonnement) {
       villages.add(new Village(1,"diourbel","refane"));
       villages.add(new Village(2,"fatick","gossass"));
       return villages.toArray(new Village[0]);

    }
}
