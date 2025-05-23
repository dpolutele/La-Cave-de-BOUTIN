package model;

/**
 * Représente une bouteille d'alcool avec ses caractéristiques.
 */
public class Bouteille {

    /** Nom de la bouteille. */
    private String nom;

    /** Type de l'alcool (ex : vin, bière, whisky...). */
    private String type;

    /** Prix en francs pacifiques (XPF). */
    private double prix;

    /** Année de production. */
    private int annee;

    /** Contenance en centilitres. */
    private double contenance;

    /** Constructeur vide (par défaut). */
    public Bouteille() {}

    /**
     * Constructeur avec paramètres.
     * @param nom Nom de la bouteille
     * @param type Type d'alcool
     * @param prix Prix en XPF
     * @param annee Année de production
     * @param contenance Contenance en cl
     */
    public Bouteille(String nom, String type, double prix, int annee, double contenance) {
        this.nom = nom;
        this.type = type;
        this.prix = prix;
        this.annee = annee;
        this.contenance = contenance;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }

    public double getContenance() { return contenance; }
    public void setContenance(double contenance) { this.contenance = contenance; }

    /**
     * Retourne une description formatée de la bouteille.
     * @return chaîne contenant les infos de la bouteille
     */
    @Override
    public String toString() {
        return nom + " (" + contenance + "cl, " + annee + ") - " + prix + " XPF";
    }
}
