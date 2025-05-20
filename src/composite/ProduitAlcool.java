package composite;

public class ProduitAlcool implements ElementCave {
    private String nom;
    private double prix; // En XPF

    public ProduitAlcool(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String afficher(String prefixe) {
        return prefixe + nom + " - " + prix + " XPF\n";
    }

    @Override
    public String toString() {
        return nom + " - " + prix + " XPF";
    }
}
