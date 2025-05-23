package strategy;

import model.Panier;

/**
 * Stratégie de calcul des taxes avec un taux fixe.
 */
public class TaxeTauxFixe implements TaxesStrategy {
    private final double taux;

    /**
     * Constructeur.
     * @param taux Taux fixe des taxes (exemple : 0.10 pour 10%)
     */
    public TaxeTauxFixe(double taux) {
        this.taux = taux;
    }

    /**
     * Calcule les taxes sur le total du panier en appliquant un taux fixe.
     * @param panier Le panier sur lequel calculer les taxes
     * @return Montant des taxes
     */
    @Override
    public double calculerTaxes(Panier panier) {
        return panier.calculerTotal() * taux;
    }
}