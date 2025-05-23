package factory;

import composite.ProduitAlcool;

/**
 * Fabrique des objets ProduitAlcool représentant des bières.
 */
public class BiereFactory implements AlcoolFactory {

    /**
     * Crée une bière avec un nom et un prix.
     * @param nom Nom de la bière
     * @param prix Prix de la bière
     * @return produit alcoolisé de type bière
     */
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Exemple : bières = 33 cl, année 2023, origine "Nouvelle-Calédonie"
        return new ProduitAlcool(nom, prix);
    }
}
