package factory;

import composite.ProduitAlcool;

public abstract class AlcoolFactory {
    public abstract ProduitAlcool creerProduit(String nom, double prix);
}
