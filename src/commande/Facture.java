package commande;

import model.Panier;

/**
 * Représente une facture associée à un client et à son panier.
 */
public class Facture {

    /** Client concerné par la facture. */
    private Client client;

    /** Panier du client. */
    private Panier panier;

    /**
     * Constructeur de la facture.
     * @param client Le client
     * @param panier Le panier
     */
    public Facture(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
    }

    /**
     * Génère une chaîne de caractères représentant la facture.
     * @return le texte de la facture
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
