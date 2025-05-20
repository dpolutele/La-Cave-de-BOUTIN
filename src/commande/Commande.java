package commande;

import model.Panier;

public class Commande {
    private Client client;
    private Panier panier;

    public Commande(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
    }

    public Client getClient() {
        return client;
    }

    public Panier getPanier() {
        return panier;
    }

    public void afficherFacture() {
        System.out.println("Facture pour " + client.getNom());
        panier.afficherPanier();
    }
}
