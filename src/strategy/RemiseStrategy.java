package strategy;

import model.Panier;

/**
 * Interface pour une stratégie de calcul de remise sur un panier.
 */
public interface RemiseStrategy {

    /**
     * Calcule la remise à appliquer sur un panier donné.
     * 
     * @param panier Le panier sur lequel la remise est calculée
     * @return Le montant de la remise
     */
    double calculerRemise(Panier panier);
}
