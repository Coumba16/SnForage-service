package sn.forage.domain;

public class Entreprise {
    private int id;
    private String nomEntreprise;

    public Entreprise(int id, String nomEntreprise) {
        this.id = id;
        this.nomEntreprise = nomEntreprise;
    }

    public int getId() {
        return id;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }
}
