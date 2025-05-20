package composite;

import model.Bouteille;

public class ProduitAlcool extends ElementCave {
    private Bouteille bouteille;

    public ProduitAlcool(String nom, Bouteille bouteille) {
        super(nom);
        this.bouteille = bouteille;
    }

    public Bouteille getBouteille() {
        return bouteille;
    }

    @Override
    public double getPrix() {
        return bouteille.getPrix();
    }

    @Override
    public void afficher(String indent) {
        System.out.println(indent + "- " + bouteille.toString());
    }

    @Override
    public String toString() {
        return bouteille.toString();
    }
}
