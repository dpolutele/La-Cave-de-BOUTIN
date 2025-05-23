package strategy;

import model.Panier;

/**
 * Interface pour une stratégie de calcul des taxes appliquées à un panier.
 */
public interface TaxesStrategy {

    /**
     * Calcule le montant des taxes à appliquer sur un panier donné.
     * 
     * @param panier Le panier sur lequel les taxes sont calculées
     * @return Le montant des taxes
     */
    double calculerTaxes(Panier panier);
}
