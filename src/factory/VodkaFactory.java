package factory;

import composite.ProduitAlcool;

/**
 * Fabrique des objets ProduitAlcool représentant des vodkas.
 */
public class VodkaFactory implements AlcoolFactory {

    /**
     * Crée une vodka avec un nom et un prix.
     * @param nom Nom de la vodka
     * @param prix Prix de la vodka
     * @return produit alcoolisé de type vodka
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Exemple : vodkas = 70 cl, année 2020, origine "Russie"
        return new ProduitAlcool(nom , prix);
    }
}
