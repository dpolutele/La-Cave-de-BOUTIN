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
import strategy.FraisDePort;
import strategy.RemisePourcentage;
import strategy.TaxeTauxFixe;

/**
 * Programme principal avec interface graphique simple pour acheter des produits dans une cave.
 * 
 * - Affiche les catégories d'alcool (bière, vin, whisky, etc.)
 * - Permet de choisir des produits à ajouter dans un panier
 * - Gère un client fictif et une commande
 * - Applique des frais, taxes et remises via des stratégies
 * - Affiche la facture finale avec le total
 */
public class GraphiqueCave {

    public static void main(String[] args) {
        // Création de la cave et du panier vide
        Cave cave = new Cave();
        Panier panier = new Panier();

        // Message de bienvenue
        JOptionPane.showMessageDialog(null, "Bienvenue dans la Cave de BOUTIN 🍷");

        boolean continuer = true;

        // Boucle principale : choix de catégorie et produits
        while (continuer) {
            // Récupère les catégories disponibles
            List<ElementCave> categories = cave.getCave().getElements();
            String[] nomsCategories = categories.stream()
                                               .map(ElementCave::getNom)
                                               .toArray(String[]::new);

            // Demande à l'utilisateur de choisir une catégorie
            String categorieChoisie = (String) JOptionPane.showInputDialog(null,
                    "Choisissez un type d'alcool :", "Catégories",
                    JOptionPane.PLAIN_MESSAGE, null, nomsCategories, nomsCategories[0]);

            if (categorieChoisie == null) break;  // Si annulation, sortir

            // Cherche la catégorie correspondante
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

            // Boucle pour ajouter plusieurs produits dans la catégorie choisie
            while (continuerDansCategorie) {
                // Filtre pour ne garder que les produits (pas les sous-catégories)
                List<ElementCave> produits = categorie.getElements();
                List<ElementCave> produitsFiltres = produits.stream()
                        .filter(p -> p instanceof ProduitAlcool)
                        .collect(Collectors.toList());

                if (produitsFiltres.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Cette catégorie ne contient pas de produits.");
                    break;
                }

                // Demande à l'utilisateur de choisir un produit
                String[] nomsProduits = produitsFiltres.stream()
                                                      .map(ElementCave::getNom)
                                                      .toArray(String[]::new);

                String produitChoisi = (String) JOptionPane.showInputDialog(null,
                        "Choisissez un produit à ajouter au panier :", "Produits",
                        JOptionPane.PLAIN_MESSAGE, null, nomsProduits, nomsProduits[0]);

                if (produitChoisi == null) break;

                // Ajoute le produit choisi au panier
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

                // Demande si on continue à ajouter d'autres produits dans cette catégorie
                int reponse = JOptionPane.showConfirmDialog(null,
                        "Voulez-vous ajouter un autre produit dans cette catégorie ?", "Continuer ?",
                        JOptionPane.YES_NO_OPTION);

                if (reponse != JOptionPane.YES_OPTION) continuerDansCategorie = false;
            }

            // Demande si on veut choisir une autre catégorie
            int reponseCategorie = JOptionPane.showConfirmDialog(null,
                    "Voulez-vous choisir un autre type d'alcool?", "Continuer ?",
                    JOptionPane.YES_NO_OPTION);

            if (reponseCategorie != JOptionPane.YES_OPTION) continuer = false;
        }

        // Informations client pour la commande
        String nomClient = JOptionPane.showInputDialog(null, "Entrez votre nom :");
        String numeroCarte = JOptionPane.showInputDialog(null, "Entrez un numéro de carte fictif :");

        // Annule si informations manquantes
        if (nomClient == null || numeroCarte == null || nomClient.isBlank() || numeroCarte.isBlank()) {
            JOptionPane.showMessageDialog(null, "Transaction annulée.");
            return;
        }

        // Création client et commande avec le panier
        Client client = new Client(nomClient, numeroCarte);
        Commande commande = new Commande(client, panier);

        // Configuration des stratégies (frais, taxes, remise)
        commande.setFraisStrategy(new FraisDePort(500));
        commande.setTaxesStrategy(new TaxeTauxFixe(0.10));
        commande.setRemiseStrategy(new RemisePourcentage(0.05));

        // Génération de la facture
        Facture facture = new Facture(client, panier);

        // Affichage final avec facture et total final
        JOptionPane.showMessageDialog(null,
                "💳 Paiement accepté.\n\n🧾 Facture :\n" + facture.afficherFacture()
                + "\n\nTotal final (frais, taxes, remises inclus) : " + commande.calculerTotalFinal() + " XPF"
                + "\n\nMerci pour votre achat !",
                "Facture", JOptionPane.INFORMATION_MESSAGE);
    }
}
