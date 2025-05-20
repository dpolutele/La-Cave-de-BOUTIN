package commande;

import model.Panier;

public class Facture {
    private Client client;
    private Panier panier;

    public Facture(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
    }

    public void imprimerFacture() {
        System.out.println("\n🧾 FACTURE");
        System.out.println("Client : " + client.getPrenom() + " " + client.getNom());
        panier.afficherPanier();
        System.out.println("📌 Facture générée avec succès.");
    }
}
