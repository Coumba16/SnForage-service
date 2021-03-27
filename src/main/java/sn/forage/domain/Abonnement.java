package sn.forage.domain;

public class Abonnement {
    private int id;
    private String numero;
    private String date;
    private String description;

    public Abonnement(int id, String numero, String date, String description) {
        this.id = id;
        this.numero = numero;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
