package model;

import composite.ProduitAlcool;
import java.util.ArrayList;
import java.util.List;
import strategy.FraisStrategy;
import strategy.RemiseStrategy;
import strategy.TaxesStrategy;

/**
 * Représente le panier d’un client contenant des produits alcoolisés.
 * 
 * Le panier permet d'ajouter, vider, et calculer le total des produits.
 * Il supporte également le calcul du total final en appliquant des stratégies
 * pour les frais, les taxes, et les remises.
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
        return produits.stream()
                       .mapToDouble(ProduitAlcool::getPrix)
                       .sum();
    }

    /**
     * Retourne une représentation textuelle du contenu du panier,
     * listant chaque produit avec son prix, puis le total.
     * @return description textuelle du panier
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ProduitAlcool produit : produits) {
            sb.append(produit.getNom())
              .append(" : ")
              .append(produit.getPrix())
              .append(" XPF\n");
        }
        sb.append("Total : ").append(calculerTotal()).append(" XPF");
        return sb.toString();
    }

    /**
     * Calcule le total final à payer en ajoutant les frais,
     * taxes et en appliquant la remise selon les stratégies fournies.
     * 
     * @param fraisStrategy stratégie pour calculer les frais de port
     * @param taxesStrategy stratégie pour calculer les taxes
     * @param remiseStrategy stratégie pour calculer la remise
     * @return montant total final en XPF
     */
    public double calculerTotalFinal(FraisStrategy fraisStrategy, TaxesStrategy taxesStrategy, RemiseStrategy remiseStrategy) {
        double total = calculerTotal();
        double frais = fraisStrategy != null ? fraisStrategy.calculerFrais(this) : 0;
        double taxes = taxesStrategy != null ? taxesStrategy.calculerTaxes(this) : 0;
        double remise = remiseStrategy != null ? remiseStrategy.calculerRemise(this) : 0;
        return total + frais + taxes - remise;
    }
}
