package composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie implements ElementCave {
    private String nom;
    private List<ElementCave> elements;

    public Categorie(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    public void ajouterElement(ElementCave e) {
        elements.add(e);
    }

    @Override
    public void afficher() {
        System.out.println("📦 Catégorie : " + nom);
        for (ElementCave e : elements) {
            e.afficher();
        }
        System.out.println("💵 Prix total : " + getPrix() + " XPF");
    }

    @Override
    public double getPrix() {
        double total = 0;
        for (ElementCave e : elements) {
            total += e.getPrix();
        }
        return total;
    }

    public List<ElementCave> getElements() {
        return elements;
    }

    public String getNom() {
        return nom;
    }
}
