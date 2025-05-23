package commande;

import model.Panier;

/**
 * Représente une commande passée par un client avec un panier associé.
 */
public class Commande {

    /** Client ayant passé la commande. */
    private Client client;

    /** Panier associé à la commande. */
    private Panier panier;

    /** Facture générée pour la commande. */
    private Facture facture;

    /**
     * Constructeur de la commande.
     * @param client Le client
     * @param panier Le panier d'achat
     */
    public Commande(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
        this.facture = new Facture(client, panier);
    }

    /**
     * Affiche la facture dans la console.
     */
    public void afficherFacture() {
        facture.afficherFacture();
    }
}
