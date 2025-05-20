package factory;

import composite.ProduitAlcool;

public class VodkaFactory implements AlcoolFactory {

    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Vodkas = 70 cl, année 2020, origine "Russie"
        return new ProduitAlcool(nom , prix);
    }
}
