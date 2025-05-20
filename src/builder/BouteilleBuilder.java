package builder;

import model.Bouteille;

public interface BouteilleBuilder {
    void reset();
    void setNom(String nom);
    void setAnnee(int annee);
    void setContenance(String contenance);
    Bouteille getResult();
}
