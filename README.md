# 🥂 La Cave de BOUTIN

Projet de Génie Logiciel en Java POO – L3 MIAGE  
UNC

---

## 🎯 Objectif

Ce projet simule la gestion d’une **cave à alcool** via une interface **console graphique**.  
L’utilisateur peut :
- Naviguer dans les catégories de produits (bière, vin, whisky, vodka)
- Sélectionner des articles (à l’unité ou en pack)
- Passer en caisse avec un **paiement fictif**
- Recevoir une **facture générée dynamiquement**

Aucune base de données n’est utilisée – les données sont simulées en mémoire.

---

## 🛠️ Design Patterns utilisés

Chaque membre du groupe a implémenté un **design pattern** dans le projet :

- 🧩 **Composite** – Organisation hiérarchique des produits  
- 🧪 **Abstract Factory** – Instanciation des différentes familles d’alcool (**bière, vin, whisky, vodka**)  
- 🎯 **Strategy** – Implementation de frais, taxes et remises 

---

## 📁 Structure du projet

src/
├── commande/ → Gestion du client, du panier et des commandes
├── composite/ → Structure hiérarchique des produits (catégories, produits)
├── factory/ → Fabrication des familles d’alcool (bière, vin, whisky, vodka)
├── main/ → Point d’entrée de l’application
├── model/ → Constantes, cave pré-remplie et objets partagés
├── strategy/ → Stratégies liés aux frais, taxes et remises


---

## 👥 Équipe

- **POLUTELE Dylan** – Strategy  
- **GALOIS Mathieu** – Composite  
- **BOUTIN Aymeric** – Abstract Factory  
