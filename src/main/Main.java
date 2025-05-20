package main;

import commande.*;
import composite.*;
import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cave cave = new Cave();
        Panier panier = new Panier();

        System.out.println("🍷 Bienvenue dans La Cave de BOUTIN !");

        while (true) {
            System.out.println("\n📋 Menu :");
            System.out.println("1. Voir les produits");
            System.out.println("2. Ajouter un produit au panier");
            System.out.println("3. Voir le panier");
            System.out.println("4. Passer commande");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                cave.getCave().afficher("");

                    break;
                case "2":
                    System.out.print("Nom exact du produit à ajouter : ");
                    String nomProduit = scanner.nextLine();
                    ProduitAlcool produitTrouve = trouverProduit(cave.getCave(), nomProduit);
                    if (produitTrouve != null) {
                        panier.ajouterProduit(produitTrouve);
                        System.out.println("✅ Produit ajouté au panier.");
                    } else {
                        System.out.println("❌ Produit introuvable.");
                    }
                    break;
                case "3":
                    panier.afficherPanier();
                    break;
                case "4":
                    System.out.print("Votre prénom : ");
                    String prenom = scanner.nextLine();
                    System.out.print("Votre nom : ");
                    String nom = scanner.nextLine();
                    Client client = new Client(nom, prenom);
                    Commande commande = new Commande(client, panier);
                    commande.afficherFacture();
                    panier.viderPanier();
                    break;
                case "0":
                    System.out.println("👋 À bientôt !");
                    scanner.close();
                    return;
                default:
                    System.out.println("❓ Choix invalide.");
            }
        }
    }

    private static ProduitAlcool trouverProduit(Categorie categorie, String nom) {
        for (ElementCave element : categorie.getElements()) {
            if (element instanceof ProduitAlcool) {
                ProduitAlcool produit = (ProduitAlcool) element;
                if (produit.getNom().equalsIgnoreCase(nom)) {
                    return produit;
                }
            } else if (element instanceof Categorie) {
                ProduitAlcool produit = trouverProduit((Categorie) element, nom);
                if (produit != null) return produit;
            }
        }
        return null;
    }
}
