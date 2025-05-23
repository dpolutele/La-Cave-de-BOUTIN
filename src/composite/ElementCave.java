package composite;

/**
 * Interface pour tous les éléments de la cave, que ce soit une catégorie ou un produit.
 */
public interface ElementCave {

    /**
     * Donne le nom de l’élément (catégorie ou produit).
     * @return nom de l’élément
     */
    String getNom();

    /**
     * Donne une version texte de l’élément avec un début de ligne (pour afficher en arbre).
     * @param prefixe Texte ajouté au début pour indenter
     * @return texte à afficher
     */
    String afficher(String prefixe);
}
