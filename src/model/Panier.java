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

    public void afficherPanier() {
        System.out.println("🛒 Contenu du panier :");
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            double total = 0;
            for (ProduitAlcool p : produits) {
                System.out.println("- " + p.getNom() + " : " + p.getPrix() + " XPF");
                total += p.getPrix();
            }
            System.out.println("💰 Total : " + total + " XPF");
        }
    }

    public void viderPanier() {
        produits.clear();
    }
}
