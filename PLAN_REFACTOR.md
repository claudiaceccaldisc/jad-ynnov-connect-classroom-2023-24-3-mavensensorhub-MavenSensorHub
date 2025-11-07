## Objectif
Ce plan de refactorisation vise à organiser le projet MavenSensorHub selon une architecture modulaire claire et découplée, 
conformément aux bonnes pratiques Maven et au principe de responsabilité unique.

## Problèmes initiaux (avant refactorisation)
- Trop de dépendances croisées entre les modules (ex. data-management dépendait de sensor-data-collection).  
- Difficulté à maintenir ou étendre le projet.  
- Structure Maven partiellement centralisée.  
- Tests non isolés et dépendants du code métier.

## Architecture cible
Organisation visée :
main-application
├── user-interface
├── data-management
├── sensor-data-collection
├── report-generation
├── utils
└── core-interfaces

- **main-application** : point d’entrée unique.  
- **core-interfaces** : interfaces communes assurant le découplage.  
- **utils** : outils partagés (logger, constantes, etc.).  
- Les modules “fonctionnels” (UI, data, sensors, reports) dépendent uniquement de `core-interfaces` et `utils`.

## Modifications prévues
- Création du module `core-interfaces` pour isoler les interfaces communes.  
- Nettoyage des dépendances dans les POMs (`provided` / `compile` selon usage).  
- Mise à jour du POM parent avec plugin management (compiler, surefire, enforcer).  
- Vérification du build avec `mvn verify` et génération de l’arbre des dépendances avant/après.

## Résultat attendu
- Dépendances linéaires (plus de cycle).  
- Tests fonctionnels exécutables sans dépendances croisées.  
- Build Maven et GitHub Actions valides (`BUILD SUCCESS`).  
- Structure conforme aux standards Maven multi-modules.
