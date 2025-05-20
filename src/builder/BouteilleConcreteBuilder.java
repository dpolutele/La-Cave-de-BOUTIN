package builder;

import model.Bouteille;

public class BouteilleConcreteBuilder implements BouteilleBuilder {

    private Bouteille bouteille;

    public BouteilleConcreteBuilder() {
        reset();
    }

    @Override
    public void reset() {
        bouteille = new Bouteille();
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
    public void setContenance(int contenance) {
        bouteille.setContenance(contenance);
    }

    @Override
    public void setPrix(double prix) {
        bouteille.setPrix(prix);
    }

    @Override
    public void setOrigine(String origine) {
        bouteille.setType(origine);
    }

    @Override
    public Bouteille getBouteille() {
        return bouteille;
    }
}
