package commande;

import model.Panier;

public class Facture {
    private Client client;
    private Panier panier;

    public Facture(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
    }

    public String afficherFacture() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client : ").append(client.getNom()).append("\n");
        sb.append("Carte : **** **** **** ").append(
            client.getNumeroCarte().length() >= 4 ? client.getNumeroCarte().substring(client.getNumeroCarte().length() - 4) : "XXXX"
        ).append("\n\n");

        sb.append("Détails du panier :\n").append(panier.toString()).append("\n");
        sb.append("");
        return sb.toString();
    }
}
