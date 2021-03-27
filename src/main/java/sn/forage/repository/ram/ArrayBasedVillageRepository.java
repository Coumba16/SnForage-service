package sn.forage.repository.ram;

import sn.forage.domain.Village;
import sn.forage.repository.VillageRepository;

public class ArrayBasedVillageRepository implements VillageRepository {
    public Village getAll() {
        return new Village[0];
    }
    public static final Village[] VILLAGES ={
         new Village(1,"tamba","tamm"),
         new Village(2,"casamance","casa") ,
    };

    public Village getById(int id) {
        Village village;
        for (int i=0; i < VILLAGES.length; i++)
        {
            if(id == VILLAGES[i].getId()){
                return VILLAGES[i];
            }
        }
        return null;
    }


}
