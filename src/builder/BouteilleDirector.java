package builder;

public class BouteilleDirector {
    private BouteilleBuilder builder;

    public BouteilleDirector(BouteilleBuilder builder) {
        this.builder = builder;
    }

    public void construireBiere(String nom, double prix) {
        builder.reset();
        builder.setNom(nom);
        builder.setPrix(prix);
        builder.setAnnee(2023);
        builder.setContenance(330);
        builder.setOrigine("Nouvelle-Calédonie");
    }

    public void construireVin(String nom, double prix) {
        builder.reset();
        builder.setNom(nom);
        builder.setPrix(prix);
        builder.setAnnee(2021);
        builder.setContenance(750);
        builder.setOrigine("France");
    }

    public void construireWhisky(String nom, double prix) {
        builder.reset();
        builder.setNom(nom);
        builder.setPrix(prix);
        builder.setAnnee(2018);
        builder.setContenance(700);
        builder.setOrigine("Écosse");
    }

    public void construireVodka(String nom, double prix) {
        builder.reset();
        builder.setNom(nom);
        builder.setPrix(prix);
        builder.setAnnee(2020);
        builder.setContenance(700);
        builder.setOrigine("Russie");
    }
}
