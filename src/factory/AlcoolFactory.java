package factory;

import composite.ProduitAlcool;

/**
 * Usine pour fabriquer des produits alcoolisés.
 * Elle crée un produit avec un nom et un prix.
 */
public interface AlcoolFactory {

    /**
     * Crée un nouveau produit alcoolisé.
     * @param nom Nom du produit (ex : Whisky)
     * @param prix Prix du produit
     * @return un produit alcoolisé prêt à être utilisé
     */
    ProduitAlcool creerProduit(String nom, double prix);
}

