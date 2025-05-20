package builder;

import model.Bouteille;

public class BouteilleDirector {
    private BouteilleBuilder builder;

    public BouteilleDirector(BouteilleBuilder builder) {
        this.builder = builder;
    }

    public Bouteille construire(String nom, int annee, String contenance) {
        builder.reset();
        builder.setNom(nom);
        builder.setAnnee(annee);
        builder.setContenance(contenance);
        return builder.getResult();
    }
}
