package composite;

/**
 * Représente un produit d’alcool dans la cave, avec son nom et son prix.
 */
public class ProduitAlcool implements ElementCave {

    /** Nom du produit (ex : Whisky, Vin rouge). */
    private String nom;

    /** Prix du produit en XPF (monnaie fictive). */
    private double prix;

    /**
     * Crée un produit avec son nom et son prix.
     * @param nom Nom du produit
     * @param prix Prix en XPF
     */
    public ProduitAlcool(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    /**
     * Donne le prix du produit.
     * @return prix en XPF
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Donne le nom du produit.
     * @return nom
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Donne une description du produit avec son prix,
     * en ajoutant une indentation pour l’affichage en liste.
     * @param prefixe Texte ajouté au début pour l’indentation
     * @return texte formaté
     */
    @Override
    public String afficher(String prefixe) {
        return prefixe + nom + " - " + prix + " XPF\n";
    }

    /**
     * Version courte du produit en texte, avec nom et prix.
     * @return texte simple
     */
    @Override
    public String toString() {
        return nom + " - " + prix + " XPF";
    }
}
