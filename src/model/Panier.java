package model;

import composite.ProduitAlcool;
import java.util.ArrayList;
import java.util.List;

/**
 * Représente le panier d’un client contenant des produits alcoolisés.
 */
public class Panier {

    /** Liste des produits ajoutés au panier. */
    private List<ProduitAlcool> produits;

    /**
     * Initialise un panier vide.
     */
    public Panier() {
        produits = new ArrayList<>();
    }

    /**
     * Ajoute un produit alcoolisé au panier.
     * @param produit Produit à ajouter
     */
    public void ajouterProduit(ProduitAlcool produit) {
        produits.add(produit);
    }

    /**
     * Vide tous les produits du panier.
     */
    public void viderPanier() {
        produits.clear();
    }

    /**
     * Calcule le prix total de tous les produits du panier.
     * @return le montant total en XPF
     */
    public double calculerTotal() {
        return produits.stream().mapToDouble(ProduitAlcool::getPrix).sum();
    }

    /**
     * Retourne une représentation textuelle du contenu du panier.
     * @return texte listant les produits et le total
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ProduitAlcool produit : produits) {
            sb.append(produit.getNom()).append(" : ").append(produit.getPrix()).append(" XPF\n");
        }
        sb.append("Total : ").append(calculerTotal()).append(" XPF");
        return sb.toString();
    }
}
