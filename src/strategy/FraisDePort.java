package strategy;

import model.Panier;

/**
 * Stratégie pour calculer des frais de port.
 */
public class FraisDePort implements FraisStrategy {
    private double frais;

    /**
     * Crée une stratégie avec des frais de port.
     * 
     * @param frais Montant fixe des frais de port
     */
    public FraisDePort(double frais) {
        this.frais = frais;
    }

    /**
     * Calcule les frais de port (fixes).
     * 
     * @param panier Le panier (non utilisé ici)
     * @return Les frais fixes
     */
    @Override
    public double calculerFrais(Panier panier) {
        return frais;
    }
}