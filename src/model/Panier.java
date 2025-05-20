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

    public double getTotal() {
        double total = 0;
        for (ProduitAlcool produit : produits) {
            total += produit.getPrix();
        }
        return total;
    }

    public void afficherPanier() {
        System.out.println(this.toString());
    }

    public void viderPanier() {
        produits.clear();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ProduitAlcool produit : produits) {
            sb.append("- ").append(produit.getNom()).append(" : ")
              .append(produit.getPrix()).append(" F CFP\n");
        }
        sb.append("\nTotal : ").append(getTotal()).append(" F CFP");
        return sb.toString();
    }
}
