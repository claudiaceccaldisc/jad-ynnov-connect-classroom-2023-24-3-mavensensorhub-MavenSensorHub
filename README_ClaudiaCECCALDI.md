# MavenSensorHub

## Objectif
Projet Maven multi-modules permettant de piloter et de gérer des capteurs (température, humidité, pression, vitesse du vent).

## Structure du projet
- **core-interfaces** : contient les interfaces et types partagés
- **utils** : classes utilitaires (Logger, etc.)
- **sensor-data-collection** : génération de données de capteurs
- **data-management** : gestion et traitement des données
- **report-generation** : génération de rapports
- **user-interface** : interaction avec l’utilisateur
- **main-application** : point d’entrée du programme (`com.jad.Main`)

## Tests
Les tests unitaires sont exécutés avec **JUnit 5**.  
Rapport disponible ici :  
`target/site/surefire-report.html`

- **26 tests réussis**
- **0 échec**

## Exécution du projet
Depuis le dossier racine :
```bash
mvn clean package
cd main-application/target
java -jar main-application-1.0-SNAPSHOT-jar-with-dependencies.jar
