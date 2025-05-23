package commande;

import model.Panier;
import strategy.FraisStrategy;
import strategy.TaxesStrategy;
import strategy.RemiseStrategy;

/**
 * Classe représentant une commande passée par un client.
 * Elle contient les stratégies de calcul de frais, taxes et remises.
 */
public class Commande {

    private Client client;
    private Panier panier;
    private Facture facture;

    private FraisStrategy fraisStrategy;
    private TaxesStrategy taxesStrategy;
    private RemiseStrategy remiseStrategy;

    public Commande(Client client, Panier panier) {
        this.client = client;
        this.panier = panier;
        this.facture = new Facture(client, panier);
    }

    public Client getClient() {
        return client;
    }

    public Panier getPanier() {
        return panier;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFraisStrategy(FraisStrategy fraisStrategy) {
        this.fraisStrategy = fraisStrategy;
    }

    public void setTaxesStrategy(TaxesStrategy taxesStrategy) {
        this.taxesStrategy = taxesStrategy;
    }

    public void setRemiseStrategy(RemiseStrategy remiseStrategy) {
        this.remiseStrategy = remiseStrategy;
    }

    /**
     * Calcule le total final de la commande en appliquant les stratégies liés aux frais, taxes et remises.*/
    public double calculerTotalFinal() {
        if (fraisStrategy == null || taxesStrategy == null || remiseStrategy == null) {
            throw new IllegalStateException("Les stratégies doivent être définies avant de calculer le total final.");
        }
        return panier.calculerTotalFinal(fraisStrategy, taxesStrategy, remiseStrategy);
    }

    /**
     * Affiche la facture.
     */
    public void afficherFacture() {
        facture.afficherFacture();
    }
}
