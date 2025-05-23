package factory;

import composite.ProduitAlcool;

/**
 * Usine qui crée des produits alcoolisés de type whisky.
 */
public class WhiskyFactory implements AlcoolFactory {

    /**
     * Crée un whisky avec un nom et un prix.
     * @param nom Nom du whisky (ex : Glenfiddich)
     * @param prix Prix du whisky en XPF
     * @return un nouveau whisky prêt à être utilisé
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // On crée un produit simple avec le nom et le prix donnés
        return new ProduitAlcool(nom , prix);
    }
}
