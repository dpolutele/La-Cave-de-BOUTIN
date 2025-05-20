package factory;

import composite.ProduitAlcool;

public class BiereFactory implements AlcoolFactory {

    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        // Bières = 33 cl, année 2023, origine "Nouvelle-Calédonie"
        return new ProduitAlcool(nom, prix);
    }
}
