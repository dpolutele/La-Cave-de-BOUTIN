package model;

public class Bouteille {
    private String nom;
    private int annee;
    private String contenance;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public void setContenance(String contenance) {
        this.contenance = contenance;
    }

    @Override
    public String toString() {
        return nom + " (" + annee + ", " + contenance + ")";
    }
}
