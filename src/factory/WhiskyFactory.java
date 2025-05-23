package factory;

import composite.ProduitAlcool;

/**
 * Fabrique des objets ProduitAlcool représentant des whiskys.
 */
public class WhiskyFactory implements AlcoolFactory {

    /**
     * Crée un whisky avec un nom et un prix.
     * @param nom Nom du whisky
     * @param prix Prix du whisky
     * @return produit alcoolisé de type whisky
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Exemple : whiskys = 70 cl, année 2018, origine "Écosse"
        return new ProduitAlcool(nom , prix);
    }
}
