package factory;

import composite.ProduitAlcool;

/**
 * Interface représentant une usine de fabrication de produits alcoolisés.
 * Permet de créer un produit avec un nom et un prix.
 */
public interface AlcoolFactory {

    /**
     * Crée un produit alcoolisé.
     * @param nom Nom du produit
     * @param prix Prix du produit
     * @return un nouvel objet ProduitAlcool
     */
    ProduitAlcool creerProduit(String nom, double prix);
}
