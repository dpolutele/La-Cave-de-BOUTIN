package commande;

import model.Panier;

public class Commande {
    private Client client;
    private Panier panier;
    private Facture facture;

    public Commande(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
        this.facture = new Facture(client, panier);
    }

    public void afficherFacture() {
        facture.afficherFacture();
    }
}
