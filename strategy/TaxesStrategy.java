package strategy;

import model.Panier;

public interface TaxesStrategy {
    double calculerTaxes(Panier panier);
}
