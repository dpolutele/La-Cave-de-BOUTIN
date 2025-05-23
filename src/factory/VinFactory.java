package factory;

import composite.ProduitAlcool;

/**
 * Usine qui crée des produits alcoolisés de type vin.
 */
public class VinFactory implements AlcoolFactory {

    /**
     * Crée un vin avec un nom et un prix.
     * @param nom Nom du vin (ex : Bordeaux)
     * @param prix Prix du vin en XPF
     * @return un nouveau vin prêt à être utilisé
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // On crée simplement un produit avec le nom et le prix donnés
        return new ProduitAlcool(nom , prix);
    }
}
