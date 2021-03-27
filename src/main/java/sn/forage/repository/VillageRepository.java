package sn.forage.repository;

import sn.forage.domain.Village;

public interface VillageRepository {
    static Village getAll();
    static Village getById(int id);
}
