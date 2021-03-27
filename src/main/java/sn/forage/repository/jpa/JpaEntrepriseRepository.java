package sn.forage.repository.jpa;

import sn.forage.domain.Entreprise;
import sn.forage.repository.EntrepriseRepository;

public class JpaEntrepriseRepository implements EntrepriseRepository {
    public Entreprise[] getAll() {
        return new Entreprise[0];
    }
}
