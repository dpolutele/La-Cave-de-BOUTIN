package factory;

import composite.ProduitAlcool;

public class VodkaFactory implements AlcoolFactory {
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        return new ProduitAlcool(nom, prix);
    }
}
