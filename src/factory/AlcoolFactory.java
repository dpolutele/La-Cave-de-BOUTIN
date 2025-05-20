package factory;

import composite.ProduitAlcool;

public interface AlcoolFactory {
    ProduitAlcool creerProduit(String nom, double prix);
}
