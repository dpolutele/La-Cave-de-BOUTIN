package factory;

import composite.ProduitAlcool;

/**
 * Usine qui crée des produits alcoolisés de type vodka.
 */
public class VodkaFactory implements AlcoolFactory {

    /**
     * Crée une vodka avec un nom et un prix.
     * @param nom Nom de la vodka (ex : Absolut)
     * @param prix Prix de la vodka en XPF
     * @return une nouvelle vodka prête à être utilisée
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // On crée simplement un produit avec le nom et le prix donnés
        return new ProduitAlcool(nom , prix);
    }
}
