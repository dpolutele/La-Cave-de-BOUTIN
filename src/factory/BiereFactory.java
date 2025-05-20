package factory;

import composite.ProduitAlcool;

public class BiereFactory implements AlcoolFactory {
    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        return new ProduitAlcool(nom, prix);
    }
}
