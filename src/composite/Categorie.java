package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une catégorie dans la cave (ex : Bières, Vins...).
 * Une catégorie peut contenir d'autres catégories ou des produits.
 */
public class Categorie implements ElementCave {

    /** Nom de la catégorie. */
    private String nom;

    /** Liste des éléments dans cette catégorie (sous-catégories ou produits). */
    private List<ElementCave> elements;

    /**
     * Crée une catégorie avec un nom donné.
     * @param nom Nom de la catégorie
     */
    public Categorie(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    /**
     * Ajoute un élément (produit ou sous-catégorie) dans cette catégorie.
     * @param element Élément à ajouter
     */
    public void ajouterElement(ElementCave element) {
        elements.add(element);
    }

    /**
     * Donne la liste des éléments contenus dans cette catégorie.
     * @return liste d'éléments
     */
    public List<ElementCave> getElements() {
        return elements;
    }

    /**
     * Retourne le nom de la catégorie.
     * @return nom de la catégorie
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Affiche la catégorie et tout ce qu’elle contient,
     * avec une indentation pour mieux voir la hiérarchie.
     * @param prefixe Texte ajouté devant chaque ligne pour l’indentation
     * @return texte représentant la catégorie et ses contenus
     */
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
