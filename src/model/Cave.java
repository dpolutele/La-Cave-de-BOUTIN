package model;

import composite.Categorie;
import factory.*;

/**
 * Représente la cave contenant toutes les catégories d'alcools.
 */
public class Cave {

    /** Catégorie racine de la cave. */
    private Categorie racine;

    /**
     * Constructeur qui initialise la cave avec toutes les catégories et produits.
     */
    public Cave() {
        racine = new Categorie("La Cave de BOUTIN");
        initialiserProduits();
    }

    /**
     * Initialise les catégories et les produits associés dans la cave.
     */
    private void initialiserProduits() {
        // Création de chaque catégorie avec des produits fabriqués par les factories

        Categorie bieres = new Categorie("Bières");
        AlcoolFactory biereFactory = new BiereFactory();
        bieres.ajouterElement(biereFactory.creerProduit("Number One 33 cl", 150));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 6 - Number One", 1150));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 12 - Number One", 1800));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 24 - Number One", 3500));
        bieres.ajouterElement(biereFactory.creerProduit("Manta Citron 33 cl", 170));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 6 - Manta Citron", 1250));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 12 - Manta Citron", 1800));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 24 - Manta Citron", 3500));
        bieres.ajouterElement(biereFactory.creerProduit("Heineken 20 cl", 170));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 6 - Heineken", 1500));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 12 - Heineken", 2000));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 24 - Heineken", 4500));

        Categorie vins = new Categorie("Vins");
        AlcoolFactory vinFactory = new VinFactory();
        vins.ajouterElement(vinFactory.creerProduit("Merlot", 1200));
        vins.ajouterElement(vinFactory.creerProduit("Chardonnay", 1300));
        vins.ajouterElement(vinFactory.creerProduit("Sauvignon Blanc Domaine de Mouirange", 1400));
        vins.ajouterElement(vinFactory.creerProduit("Rosé de Nouméa", 1350));
        vins.ajouterElement(vinFactory.creerProduit("Pinot Noir Domaine de Prony", 1700));

        Categorie whiskys = new Categorie("Whiskys");
        AlcoolFactory whiskyFactory = new WhiskyFactory();
        whiskys.ajouterElement(whiskyFactory.creerProduit("Jack Daniel's", 3500));
        whiskys.ajouterElement(whiskyFactory.creerProduit("Red Label", 3000));
        whiskys.ajouterElement(whiskyFactory.creerProduit("Black Label", 4500));
        whiskys.ajouterElement(whiskyFactory.creerProduit("Blue Label", 9500));

        Categorie vodkas = new Categorie("Vodkas");
        AlcoolFactory vodkaFactory = new VodkaFactory();
        vodkas.ajouterElement(vodkaFactory.creerProduit("Smirnoff", 2800));
        vodkas.ajouterElement(vodkaFactory.creerProduit("Absolut", 3000));
        vodkas.ajouterElement(vodkaFactory.creerProduit("Belvedere", 4800));

        racine.ajouterElement(bieres);
        racine.ajouterElement(vins);
        racine.ajouterElement(whiskys);
        racine.ajouterElement(vodkas);
    }

    /**
     * Retourne la catégorie racine de la cave.
     * @return racine de la cave
     */
    public Categorie getCave() {
        return racine;
    }
}
