package strategy;

import model.Panier;

public class TaxeTauxFixe implements TaxesStrategy {
    private final double taux;

    public TaxeTauxFixe(double taux) {
        this.taux = taux;
    }

    @Override
    public double calculerTaxes(Panier panier) {
        return panier.calculerTotal() * taux;
    }
}
