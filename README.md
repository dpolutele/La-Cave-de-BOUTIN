# 🥂 La Cave de BOUTIN

Projet de Génie Logiciel en Java POO – L3 MIAGE  
UNC

---

## 🎯 Objectif

Ce projet simule la gestion d’une **cave à alcool** via une interface **console interactive**.  
L’utilisateur peut :
- Naviguer dans les catégories de produits (bière, vin, whisky, vodka)
- Sélectionner des articles (à l’unité ou en pack)
- Passer en caisse avec un **paiement fictif**
- Recevoir une **facture générée dynamiquement**

Aucune base de données n’est utilisée – les données sont simulées en mémoire.

---

## 🛠️ Design Patterns utilisés

Chaque membre du groupe a implémenté un **design pattern** dans le projet :

- 🏗️ **Builder** – Création de bouteilles personnalisées ou de coffrets cadeaux  
- 🧩 **Composite** – Organisation hiérarchique des produits  
- 🧪 **Abstract Factory** – Instanciation des différentes familles d’alcool (**bière, vin, whisky, vodka**)

---

## 📁 Structure du projet
src/
├── builder/ → Construction d’objets complexes (bouteilles, coffrets)
├── composite/ → Structure hiérarchique des produits (catégories, produits)
├── factory/ → Fabrication des familles d’alcool (bière, vin, whisky, vodka)
├── commande/ → Gestion client, panier, commande
├── strategy/ → (non utilisé dans cette version)
├── model/ → Constantes et données partagées
├── main/ → Point d’entrée de l’application


---

## Équipe

- **POLUTELE Dylan** – Builder  
- **GALOIS Mathieu** – Composite  
- **BOUTIN Aymeric** – Abstract Factory  

