package sn.forage.repository.jdbc;

import sn.forage.domain.Entreprise;
import sn.forage.repository.EntrepriseRepository;

public class JdbcBasedEntrepriseRepository implements EntrepriseRepository {
    public Entreprise[] getAll() {
        return new Entreprise[0];
    }
}
