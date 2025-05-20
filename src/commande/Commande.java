package commande;

import model.Panier;

public class Commande {
    private Client client;
    private Panier panier;

    public Commande(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
    }

    public void afficherFacture() {
        System.out.println("\n🧾 Facture de " + client.getPrenom() + " " + client.getNom() + " :");
        panier.afficherPanier();
        System.out.println("✅ Merci pour votre achat !");
    }
}
