package main;

import commande.Client;
import commande.Commande;
import commande.Facture;
import composite.Categorie;
import composite.ElementCave;
import composite.ProduitAlcool;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.*;
import model.Cave;
import model.Panier;

public class GraphiqueCave {

    public static void main(String[] args) {
        Cave cave = new Cave();
        Panier panier = new Panier();

        JOptionPane.showMessageDialog(null, "Bienvenue dans la Cave de BOUTIN 🍷");

        boolean continuer = true;

        while (continuer) {
            // 1. Choix de la catégorie
            List<ElementCave> categories = cave.getCave().getElements();
            String[] nomsCategories = categories.stream()
                                               .map(ElementCave::getNom)
                                               .toArray(String[]::new);

            String categorieChoisie = (String) JOptionPane.showInputDialog(null,
                    "Choisissez une catégorie :", "Catégories",
                    JOptionPane.PLAIN_MESSAGE, null, nomsCategories, nomsCategories[0]);

            if (categorieChoisie == null) {
                // Annuler -> quitter
                break;
            }

            // Trouver la catégorie choisie
            Categorie categorie = null;
            for (ElementCave c : categories) {
                if (c.getNom().equals(categorieChoisie) && c instanceof Categorie) {
                    categorie = (Categorie) c;
                    break;
                }
            }

            if (categorie == null) {
                JOptionPane.showMessageDialog(null, "Catégorie invalide.");
                continue;
            }

            boolean continuerDansCategorie = true;

            while (continuerDansCategorie) {
                List<ElementCave> produits = categorie.getElements();
                List<ElementCave> produitsFiltres = produits.stream()
                        .filter(p -> p instanceof ProduitAlcool)
                        .collect(Collectors.toList());

                if (produitsFiltres.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Cette catégorie ne contient pas de produits.");
                    break;
                }

                String[] nomsProduits = produitsFiltres.stream()
                                                      .map(ElementCave::getNom)
                                                      .toArray(String[]::new);

                String produitChoisi = (String) JOptionPane.showInputDialog(null,
                        "Choisissez un produit à ajouter au panier :", "Produits",
                        JOptionPane.PLAIN_MESSAGE, null, nomsProduits, nomsProduits[0]);

                if (produitChoisi == null) {
                    // Annulation -> sortir de la catégorie
                    break;
                }

                boolean produitAjoute = false;
                for (ElementCave produit : produitsFiltres) {
                    if (produit.getNom().equals(produitChoisi)) {
                        panier.ajouterProduit((ProduitAlcool) produit);
                        JOptionPane.showMessageDialog(null, produitChoisi + " ajouté au panier !");
                        produitAjoute = true;
                        break;
                    }
                }

                if (!produitAjoute) {
                    JOptionPane.showMessageDialog(null, "Produit invalide.");
                    break;
                }

                int reponse = JOptionPane.showConfirmDialog(null,
                        "Voulez-vous ajouter un autre produit dans cette catégorie ?", "Continuer ?",
                        JOptionPane.YES_NO_OPTION);

                if (reponse != JOptionPane.YES_OPTION) {
                    continuerDansCategorie = false;
                }
            }

            int reponseCategorie = JOptionPane.showConfirmDialog(null,
                    "Voulez-vous choisir une autre catégorie ?", "Continuer ?",
                    JOptionPane.YES_NO_OPTION);

            if (reponseCategorie != JOptionPane.YES_OPTION) {
                continuer = false;
            }
        }

        // Paiement fictif
        String nomClient = JOptionPane.showInputDialog(null, "Entrez votre nom :");
        String numeroCarte = JOptionPane.showInputDialog(null, "Entrez un numéro de carte fictif :");

        if (nomClient == null || numeroCarte == null || nomClient.isBlank() || numeroCarte.isBlank()) {
            JOptionPane.showMessageDialog(null, "Transaction annulée.");
            return;
        }

        Client client = new Client(nomClient, numeroCarte);
        Commande commande = new Commande(client, panier);
        Facture facture = new Facture(client, panier);

        JOptionPane.showMessageDialog(null,
                "💳 Paiement accepté.\n\n🧾 Facture :\n" + facture.afficherFacture()
                        + "\n\nMerci pour votre achat !",
                "Facture", JOptionPane.INFORMATION_MESSAGE);
    }
}
