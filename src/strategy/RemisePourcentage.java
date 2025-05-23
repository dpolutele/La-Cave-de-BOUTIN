package strategy;

import model.Panier;

public class RemisePourcentage implements RemiseStrategy {
    private final double pourcentage;

    public RemisePourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    @Override
    public double calculerRemise(Panier panier) {
        return panier.calculerTotal() * pourcentage;
    }
}
