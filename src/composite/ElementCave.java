package composite;

public abstract class ElementCave {
    protected String nom;

    public ElementCave(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public abstract double getPrix();

    public abstract void afficher(String indent);
}
