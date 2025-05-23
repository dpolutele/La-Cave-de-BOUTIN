package commande;

import model.Panier;
import strategy.FraisStrategy;
import strategy.RemiseStrategy;
import strategy.TaxesStrategy;

/**
 * Gère une commande avec un client, un panier, et les règles
 * pour calculer frais, taxes et remises.
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
     * Calcule le prix final avec frais, taxes et remises.
     */
    public double calculerTotalFinal() {
        if (fraisStrategy == null || taxesStrategy == null || remiseStrategy == null) {
            throw new IllegalStateException("Stratégies non définies.");
        }
        return panier.calculerTotalFinal(fraisStrategy, taxesStrategy, remiseStrategy);
    }

    /**
     * Affiche la facture de la commande.
     */
    public void afficherFacture() {
        facture.afficherFacture();
    }
}
