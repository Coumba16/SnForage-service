package sn.forage.repository.jdbc;

import sn.forage.domain.Consommation;
import sn.forage.repository.ConsommationRepository;

public class JdbcBasedConsommationRepository implements ConsommationRepository {
    public Consommation[] getAll() {
        return new Consommation[0];
    }
}
