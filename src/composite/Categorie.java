package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente une catégorie dans la cave (ex : Bières, Vins...).
 * Une catégorie peut contenir des sous-catégories ou des produits.
 */
public class Categorie implements ElementCave {

    /** Nom de la catégorie. */
    private String nom;

    /** Liste des éléments contenus dans cette catégorie. */
    private List<ElementCave> elements;

    /**
     * Constructeur avec le nom de la catégorie.
     * @param nom Le nom de la catégorie
     */
    public Categorie(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    /**
     * Ajoute un élément (produit ou sous-catégorie) à la catégorie.
     * @param element Élément à ajouter
     */
    public void ajouterElement(ElementCave element) {
        elements.add(element);
    }

    /**
     * Retourne la liste des éléments contenus.
     * @return liste d'éléments
     */
    public List<ElementCave> getElements() {
        return elements;
    }

    /**
     * Retourne le nom de la catégorie.
     * @return nom
     */
    @Override
    public String getNom() {
        return nom;
    }

    /**
     * Affiche récursivement la catégorie et son contenu.
     * @param prefixe Préfixe pour indentation
     * @return représentation textuelle
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
