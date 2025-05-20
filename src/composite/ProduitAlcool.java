package composite;

public class ProduitAlcool implements ElementCave {
    private String nom;
    private double prix;

    public ProduitAlcool(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public void afficher() {
        System.out.println("- " + nom + " : " + prix + " XPF");
    }

    @Override
    public double getPrix() {
        return prix;
    }

    public String getNom() {
        return nom;
    }
}
