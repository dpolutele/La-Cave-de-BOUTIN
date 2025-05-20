package model;

public class Bouteille {
    private String nom;
    private String type;
    private double prix; // En francs pacifiques (XPF)
    private int annee;
    private double contenance; // en cl (centilitres)

    public Bouteille() {
    }

    public Bouteille(String nom, String type, double prix, int annee, double contenance) {
        this.nom = nom;
        this.type = type;
        this.prix = prix;
        this.annee = annee;
        this.contenance = contenance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public double getContenance() {
        return contenance;
    }

    public void setContenance(double contenance) {
        this.contenance = contenance;
    }

    @Override
    public String toString() {
        return nom + " (" + contenance + "cl, " + annee + ") - " + prix + " XPF";
    }
}
