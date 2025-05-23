package factory;

import composite.ProduitAlcool;

/**
 * Usine qui crée des produits alcoolisés de type bière.
 */
public class BiereFactory implements AlcoolFactory {

    /**
     * Crée une bière avec un nom et un prix.
     * @param nom Nom de la bière (ex : Lager)
     * @param prix Prix de la bière en XPF
     * @return une nouvelle bière prête à être ajoutée au panier
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Ici on crée simplement un produit avec le nom et le prix donnés
        return new ProduitAlcool(nom, prix);
    }
}
