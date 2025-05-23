package strategy;

import model.Panier;

/**
 * Implémentation de la stratégie de frais de port.
 */
public class FraisDePort implements FraisStrategy {
    private double frais;

    /**
     * Constructeur.
     * @param frais Montant fixe des frais de port
     */
    public FraisDePort(double frais) {
        this.frais = frais;
    }

    /**
     * Calcule les frais de port (fixes), indépendamment du panier.
     * @param panier le panier (non utilisé ici)
     * @return les frais fixes
     */
    @Override
    public double calculerFrais(Panier panier) {
        return frais;
    }
}
