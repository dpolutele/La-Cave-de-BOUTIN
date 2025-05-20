package factory;

import builder.BouteilleBuilder;
import builder.BouteilleDirector;
import builder.BouteilleConcreteBuilder;
import composite.ProduitAlcool;
import model.Bouteille;

public class WhiskyFactory extends AlcoolFactory {

    @Override
    public ProduitAlcool creerProduit(String nom, double prix) {
        BouteilleBuilder builder = new BouteilleConcreteBuilder();
        BouteilleDirector director = new BouteilleDirector(builder);
        director.construireWhisky(nom, prix);
        Bouteille bouteille = builder.getBouteille();
        return new ProduitAlcool(nom, bouteille);
    }
}
