# 🥂 La Cave de BOUTIN

Projet de Génie Logiciel en Java POO – L3 MIAGE  
UNC

## 🎯 Objectif

Ce projet simule la gestion de la **caisse d'une cave à alcool**.  
Il permet de gérer les commandes des clients et de générer automatiquement les **factures** associées, sans base de données.

---

## 🛠️ Design Patterns utilisés

Chaque membre du groupe applique un design pattern pour la conception de ce projet :

- 🏗️ **Builder** – pour la création de bouteilles ou coffrets personnalisés 
- 🧩 **Composite** – pour structurer les produits et catégories d’alcool 
- 🧪 **Abstract Factory** – pour instancier différents types d’alcool (vin, bière, whisky) 

---

## 📁 Structure du projet
src/
├── builder/ → Construction d’objets complexes (bouteilles, coffrets)
├── composite/ → Structure hiérarchique des produits (catégories, produits)
├── factory/ → Fabrication des familles d’alcool
├── commande/ → Données relatives aux clients et aux commandes
├── strategy/ → (non utilisé pour ce projet)
├── model/ → Constantes et données partagées
├── main/ → Point d’entrée de l’application


---

## 👨‍👩‍👦 Équipe

- **POLUTELE Dylan** – Builder
- **GALOIS Mathieu** – Composite
- **BOUTIN Aymeric** – Abstract Factory
