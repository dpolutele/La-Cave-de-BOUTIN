package strategy;

import model.Panier;

/**
 * Stratégie de remise basée sur un pourcentage du total du panier.
 */
public class RemisePourcentage implements RemiseStrategy {
    private final double pourcentage;

    /**
     * Constructeur.
     * 
     * @param pourcentage Le pourcentage de remise à appliquer (ex : 0.05 pour 5%)
     */
    public RemisePourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    /**
     * Calcule la remise en appliquant un pourcentage au total du panier.
     * 
     * @param panier Le panier sur lequel appliquer la remise
     * @return Le montant de la remise calculée
     */
    @Override
    public double calculerRemise(Panier panier) {
        return panier.calculerTotal() * pourcentage;
    }
}
