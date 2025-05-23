package factory;

import composite.ProduitAlcool;

/**
 * Fabrique des objets ProduitAlcool représentant des vins.
 */
public class VinFactory implements AlcoolFactory {

    /**
     * Crée un vin avec un nom et un prix.
     * @param nom Nom du vin
     * @param prix Prix du vin
     * @return produit alcoolisé de type vin
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Exemple : vins = 75 cl, année 2021, origine "France"
        return new ProduitAlcool(nom , prix);
    }
}
