package builder;

import model.Bouteille;

public class BouteilleConcreteBuilder implements BouteilleBuilder {
    private Bouteille bouteille;

    public BouteilleConcreteBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.bouteille = new Bouteille();
    }

    @Override
    public void setNom(String nom) {
        bouteille.setNom(nom);
    }

    @Override
    public void setAnnee(int annee) {
        bouteille.setAnnee(annee);
    }

    @Override
    public void setContenance(String contenance) {
        bouteille.setContenance(contenance);
    }

    @Override
    public Bouteille getResult() {
        return this.bouteille;
    }
}
