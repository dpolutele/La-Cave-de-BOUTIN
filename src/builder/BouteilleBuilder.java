package builder;

import model.Bouteille;

public interface BouteilleBuilder {
    void reset();
    void setNom(String nom);
    void setAnnee(int annee);
    void setContenance(int contenance);
    void setPrix(double prix);
    void setOrigine(String origine);
    Bouteille getBouteille();
}
