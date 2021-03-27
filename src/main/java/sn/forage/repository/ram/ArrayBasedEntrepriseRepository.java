package sn.forage.repository.ram;

import sn.forage.domain.Entreprise;
import sn.forage.repository.EntrepriseRepository;

public class ArrayBasedEntrepriseRepository implements EntrepriseRepository {
    public Entreprise[] getAll() {
        return new Entreprise[]{
                new Entreprise(1,"SenForage"),
                new Entreprise(2,"SenEau"),
        };
    }


}
