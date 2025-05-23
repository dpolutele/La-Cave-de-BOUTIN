package strategy;

import model.Panier;

/**
 * Interface pour une stratégie de calcul des frais.
 */
public interface FraisStrategy {
    /**
     * Calcule les frais en fonction du panier.
     * 
     * @param panier Le panier sur lequel calculer les frais
     * @return Le montant des frais calculés
     */
    double calculerFrais(Panier panier);
}
