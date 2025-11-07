# MavenSensorHub – Projet Maven Modulaire

## Présentation
Ce projet est un hub de capteurs développé dans le cadre du module **Architecture Logicielle **.  
Il met en œuvre une architecture modulaire avec Maven, en appliquant les principes de séparation des responsabilités et de dépendances maîtrisées.

## Modules du projet
- **main-application** : point d’entrée principal du programme.
- **data-management** : gestion et traitement des données.
- **sensor-data-collection** : acquisition et collecte des données issues des capteurs.
- **report-generation** : génération et export de rapports.
- **user-interface** : interface utilisateur.
- **core-interfaces** : interfaces partagées (API/SPI) assurant le découplage entre modules.
- **test** : tests unitaires (JUnit 5).

## Activité 3 – Configuration Maven
Lors de l’activité précédente, la structure modulaire a été mise en place, les dépendances centralisées et le build Maven finalisé.  
Le projet a été entièrement nettoyé et configuré pour produire des artefacts `.jar` exécutables et un rapport de test.

## Activité 4 – Structuration Maven
Comme la structuration modulaire avait déjà été réalisée au TP précédent, aucune modification fonctionnelle n’a été nécessaire.  
Un contrôle complet de cohérence a été effectué :
- Vérification de la compilation et des tests (`mvn clean verify`) → ✅ *BUILD SUCCESS*
- Vérification des dépendances (`dependency-tree.after.txt`) → structure stable, aucune dépendance circulaire.
- Ajout du fichier **REFLEXION.md** résumant la validation de la structure et la conformité Maven.

## Résultat
Le projet Maven est :
- **Modulaire et cohérent**
- **Totalement fonctionnel**
- **Prêt pour livraison ou extension future**
