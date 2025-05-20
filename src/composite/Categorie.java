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

    public void ajouterElement(ElementCave element) {
        elements.add(element);
    }

    public List<ElementCave> getElements() {
        return elements;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String afficher(String prefixe) {
        StringBuilder sb = new StringBuilder();
        sb.append(prefixe).append(nom).append("\n");
        for (ElementCave e : elements) {
            sb.append(e.afficher(prefixe + "  "));
        }
        return sb.toString();
    }
}
