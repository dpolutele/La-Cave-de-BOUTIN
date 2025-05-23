package composite;

/**
 * Représente un produit alcoolisé dans la cave.
 */
public class ProduitAlcool implements ElementCave {

    /** Nom du produit. */
    private String nom;

    /** Prix du produit en XPF. */
    private double prix;

    /**
     * Constructeur avec nom et prix.
     * @param nom Nom du produit
     * @param prix Prix du produit en XPF
     */
    public ProduitAlcool(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    /**
     * Retourne le prix du produit.
     * @return prix en XPF
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Retourne le nom du produit.
     * @return nom
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Retourne une représentation textuelle pour affichage.
     * @param prefixe Indentation
     * @return texte formaté
     */
    @Override
    public String afficher(String prefixe) {
        return prefixe + nom + " - " + prix + " XPF\n";
    }

    /**
     * Représentation courte du produit.
     * @return chaîne de caractères
     */
    @Override
    public String toString() {
        return nom + " - " + prix + " XPF";
    }
}
