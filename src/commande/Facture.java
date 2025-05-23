package commande;

import model.Panier;

/**
 * Représente une facture pour un client et son panier.
 */
public class Facture {

    /** Le client qui a passé la commande. */
    private Client client;

    /** Le panier contenant les articles achetés. */
    private Panier panier;

    /**
     * Crée une facture pour un client et son panier.
     */
    public Facture(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
    }

    /**
     * Retourne le texte de la facture avec les détails.
     */
    public String afficherFacture() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client : ").append(client.getNom()).append("\n");
        sb.append("Carte : **** **** **** ").append(
            client.getNumeroCarte().length() >= 4 ? client.getNumeroCarte().substring(client.getNumeroCarte().length() - 4) : "XXXX"
        ).append("\n\n");
        sb.append("Détails du panier :\n").append(panier.toString()).append("\n");
        return sb.toString();
    }
}
