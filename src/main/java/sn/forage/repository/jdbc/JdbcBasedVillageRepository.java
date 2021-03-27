package sn.forage.repository.jdbc;

import sn.forage.domain.Village;
import sn.forage.repository.VillageRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcBasedVillageRepository implements VillageRepository {
    private final DataSource dataSource;

    public JdbcBasedVillageRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }



    public Village[] getAll() {
        String query = "SELECT id, nom FROM village";
        List<Village> villages = new ArrayList<Village>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                String libelle = rs.getString("libelle");
                Village village = new Village(id,nom,libelle);
                villages.add(village);
            }
                return villages.toArray(new Village[0]);
        }
        catch (SQLException e) {
            return new Village[0];

        }
        catch (Exception ex){
            return new Village[0];
        }
    }


    public Village getById(int id) {
        String query = "SELECT id, nom , libelle from prestation where id = ?";
        try {
            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            int retrievedId = rs.getInt("id");
            String retrievedName = rs.getString("nom");
            String retrievedLibelle = rs.getString("libelle");
            Village village = new Village(retrievedId, retrievedName, retrievedLibelle);
            return village;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;

    }
}
