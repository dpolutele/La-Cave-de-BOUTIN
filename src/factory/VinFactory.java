package factory;

import composite.ProduitAlcool;

public class VinFactory implements AlcoolFactory {

    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Vins = 75 cl, année 2021, origine "France"
        return new ProduitAlcool(nom , prix);
    }
}
