# Application-de-gestion-des-taches
## Contexte
Dans le cadre d’une gestion de projets efficace, il devient essentiel de suivre l’avancement des tâches attribuées aux membres d’une équipe. Qu’il s’agisse de développement logiciel, 
d’organisation d’événements ou de tout autre domaine collaboratif, les outils numériques de gestion de tâches permettent de structurer le travail, prioriser les actions et assurer un bon suivi.
## Problématique
Comment centraliser et simplifier la gestion des tâches dans différents projets tout en permettant aux utilisateurs de suivre leur progression en temps réel ?
De plus, comment fournir une vue claire de l’avancement général pour chaque projet et garantir une interaction fluide, sans rechargement de page, pour une meilleure expérience utilisateur ?
## Objectifs
Développer une application web permettant :

-De créer et gérer des projets et leurs tâches associées

-De classifier les tâches par catégorie

-D’attribuer des tâches aux utilisateurs

-De modifier l’état d’une tâche dynamiquement via AJAX

-De visualiser ses propres tâches dans une section dédiée (Mes tâches)

-D’afficher des statistiques de progression des projets sous forme de graphiques (via Chart.js)
##  Structure du projet
Packages :

entities : contient les classes User, Projet, Tache, CategorieTache

dao / dao2 : contient les DAO standards et une DAO générique (AbstractDao)

config : configuration Hibernate (hibernate.cfg.xml)

util : HibernateUtil.java pour la gestion de session

test : classes de test (TestCreation, TestUpdateTache, TestProjetCategorie, TestMapped, TestDeleteTache)
##  Diagramme de classe
![Image](https://github.com/user-attachments/assets/32934973-9024-4a10-8a5e-74a5f3290693)
---
## modèle conceptuel de la base généré
<img width="736" alt="Image" src="https://github.com/user-attachments/assets/486f669c-91f1-44a6-8387-16ee806fc0b6" />

---
## Tests fonctionnels
###  Test de création
<img width="722" alt="Image" src="https://github.com/user-attachments/assets/cc43cd67-a6c3-4683-a82a-4d6bd9d437e9" />

###  Test de suppression
<img width="730" alt="Image" src="https://github.com/user-attachments/assets/3b5f365b-d366-4295-9b69-062373a33ae8" />

###  Test de mapping 


###  Test projet / catégorie


###  Test de mise à jour

