package composite;

import java.util.ArrayList;
import java.util.List;

public class Categorie extends ElementCave {
    private List<ElementCave> elements;

    public Categorie(String nom) {
        super(nom);
        this.elements = new ArrayList<>();
    }

    public void ajouterElement(ElementCave element) {
        elements.add(element);
    }

    public void retirerElement(ElementCave element) {
        elements.remove(element);
    }

    public List<ElementCave> getElements() {
        return elements;
    }

    @Override
    public double getPrix() {
        double total = 0;
        for (ElementCave element : elements) {
            total += element.getPrix();
        }
        return total;
    }

    @Override
    public void afficher(String indent) {
        System.out.println(indent + "+ " + nom);
        for (ElementCave element : elements) {
            element.afficher(indent + "  ");
        }
    }

    public List<ElementCave> listerProduits() {
        List<ElementCave> liste = new ArrayList<>();
        for (ElementCave element : elements) {
            if (element instanceof Categorie) {
                liste.addAll(((Categorie) element).listerProduits());
            } else {
                liste.add(element);
            }
        }
        return liste;
    }
}
