package factory;

import composite.ProduitAlcool;

public class WhiskyFactory implements AlcoolFactory {

    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Whiskys = 70 cl, année 2018, origine "Écosse"
        return new ProduitAlcool(nom , prix);
    }
}
