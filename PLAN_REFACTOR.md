# PLAN_REFACTOR.md

## Objectif
Ce plan de refactorisation a pour but d’organiser le projet **MavenSensorHub** selon une architecture modulaire, claire, maintenable et découplée.  
L’objectif est de limiter les dépendances croisées entre modules et d’assurer une meilleure isolation des responsabilités, conformément aux bonnes pratiques Maven et au principe SOLID.

---

## Problèmes initiaux (avant refactorisation)
- Trop de dépendances croisées entre modules (ex. `data-management` ↔ `sensor-data-collection`).
- Difficulté à faire évoluer le projet sans impacter d’autres modules.
- Absence d’un module central pour regrouper les interfaces partagées.
- Organisation Maven incomplète : dépendances et plugins dispersés.
- Risque de duplication de code et de conflits de dépendances.

---

## Architecture cible (après refactorisation)
Structure modulaire visée :
MavenSensorHub
├── main-application → point d’entrée de l’application
├── core-interfaces → interfaces communes (découplage)
├── sensor-data-collection → génération de données capteurs
├── data-management → gestion des données
├── report-generation → génération de rapports
├── user-interface → interactions utilisateur
└── utils → classes utilitaires (log, constantes, etc.)

### Principes retenus :
- `main-application` dépend de **tous les autres** modules.
- Les autres modules dépendent uniquement de :
    - `core-interfaces` (interfaces partagées)
    - `utils` (fonctionnalités utilitaires)
- Plus **aucune dépendance circulaire** entre les modules fonctionnels.

---

## Modifications effectuées
- Création du module **`core-interfaces`** pour isoler toutes les interfaces communes (`ILogger`, `ISensor`, etc.).
- Suppression des dépendances inutiles entre modules (`data-management`, `sensor-data-collection`, etc.).
- Nettoyage complet des fichiers **POM** :
    - un **POM parent** gère les plugins et dépendances communes (enforcer, compiler, surefire, etc.).
    - chaque module ne déclare que ses dépendances nécessaires.
- Vérification des dépendances avant et après refactorisation avec `mvn dependency:tree`.
- Ajout d’un **rapport de tests Maven** (`mvn surefire-report:report`).
- Création d’un **jar exécutable** (`maven-assembly-plugin`).

---

## Résultats attendus et obtenus
- Build et tests **validés** (`BUILD SUCCESS`).
- Projet exécutable via `java -jar main-application-1.0-SNAPSHOT-jar-with-dependencies.jar`.
- GitHub Actions exécutent les tests automatiquement à chaque push.
- Structure du projet désormais **claire, modulaire et extensible**.

---

## Conclusion
Le projet **MavenSensorHub** est désormais parfaitement structuré :
- Architecture Maven multi-modules conforme.
- Dépendances propres et hiérarchiques.
- Build reproductible et automatisé.
- Documentation et rapports complets (before/after, réflexion, plan).

Cette refactorisation garantit une meilleure maintenabilité, évolutivité et lisibilité du code pour les développements futurs.

