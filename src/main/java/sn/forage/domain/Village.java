package sn.forage.domain;

public class Village {
    private int id;
    private String nom;
    private String libelle;

    public Village(int id, String nom, String libelle) {
        this.id = id;
        this.nom = nom;
        this.libelle = libelle;
            }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getLibelle() {
        return libelle;
    }
}
