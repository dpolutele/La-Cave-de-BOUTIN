package composite;

/**
 * Interface commune aux éléments de la cave (catégories ou produits).
 */
public interface ElementCave {

    /**
     * Retourne le nom de l'élément.
     * @return nom de l'élément
     */
    String getNom();

    /**
     * Retourne une représentation textuelle de l'élément avec indentation.
     * @param prefixe Le préfixe utilisé pour l'affichage en arborescence
     * @return chaîne de caractères affichable
     */
    String afficher(String prefixe);
}
