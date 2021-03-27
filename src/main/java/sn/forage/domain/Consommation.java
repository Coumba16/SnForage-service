package sn.forage.domain;

public class Consommation {
    private int id;
    private int nombreLitre;
    private long prix;
    private String date;

    public Consommation(int id, int nombreLitre, long prix, String date) {
        this.id = id;
        this.nombreLitre = nombreLitre;
        this.prix = prix;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getNombreLitre() {
        return nombreLitre;
    }

    public long getPrix() {
        return prix;
    }

    public String getDate() {
        return date;
    }
}
