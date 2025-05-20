package model;

import composite.ProduitAlcool;
import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<ProduitAlcool> produits;

    public Panier() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(ProduitAlcool produit) {
        produits.add(produit);
    }

    public void viderPanier() {
        produits.clear();
    }

    public double calculerTotal() {
        return produits.stream().mapToDouble(ProduitAlcool::getPrix).sum();
    }

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
