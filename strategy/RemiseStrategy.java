package strategy;

import model.Panier;

public interface RemiseStrategy {
    double calculerRemise(Panier panier);
}
