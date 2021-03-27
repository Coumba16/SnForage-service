package sn.forage.repository.ram;

import sn.forage.domain.Consommation;
import sn.forage.repository.ConsommationRepository;

public class ArrayBasedConsommationRepository implements ConsommationRepository {
    public Consommation[] getAll() {
        return new Consommation[]{
                new Consommation(1,5,5000,"10.10.2021"),
                new Consommation(1,3,3000,"1.10.2021"),
                new Consommation(1,2,2000,"15.10.2021"),

        };
    }
}
