package model;

import composite.*;
import factory.*;

public class Cave {
    private Categorie racine;

    public Cave() {
        racine = new Categorie("La Cave de BOUTIN");
        initialiserProduits();
    }

    private void initialiserProduits() {
        // Bières
        Categorie bieres = new Categorie("Bières");
        AlcoolFactory biereFactory = new BiereFactory();
        bieres.ajouterElement(biereFactory.creerProduit("Number One", 150));
        bieres.ajouterElement(biereFactory.creerProduit("Manta Citron", 170));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 12", 1800));
        bieres.ajouterElement(biereFactory.creerProduit("Pack de 24", 3500));

        // Vins
        Categorie vins = new Categorie("Vins");
        AlcoolFactory vinFactory = new VinFactory();
        vins.ajouterElement(vinFactory.creerProduit("Merlot", 1200));
        vins.ajouterElement(vinFactory.creerProduit("Chardonnay", 1300));

        // Whiskys
        Categorie whiskys = new Categorie("Whiskys");
        AlcoolFactory whiskyFactory = new WhiskyFactory();
        whiskys.ajouterElement(whiskyFactory.creerProduit("Jack Daniel's", 3500));
        whiskys.ajouterElement(whiskyFactory.creerProduit("Red Label", 3000));
        whiskys.ajouterElement(whiskyFactory.creerProduit("Black Label", 4500));
        whiskys.ajouterElement(whiskyFactory.creerProduit("Blue Label", 9500));

        // Vodkas
        Categorie vodkas = new Categorie("Vodkas");
        AlcoolFactory vodkaFactory = new VodkaFactory();
        vodkas.ajouterElement(vodkaFactory.creerProduit("Smirnoff", 2800));
        vodkas.ajouterElement(vodkaFactory.creerProduit("Absolut", 3000));
        vodkas.ajouterElement(vodkaFactory.creerProduit("Belvedere", 4800));

        // Ajout dans la racine
        racine.ajouterElement(bieres);
        racine.ajouterElement(vins);
        racine.ajouterElement(whiskys);
        racine.ajouterElement(vodkas);
    }

    public Categorie getCave() {
        return racine;
    }
}
