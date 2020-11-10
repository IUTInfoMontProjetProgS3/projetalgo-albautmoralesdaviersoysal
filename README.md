# ![](ressources/logo.jpeg) Projet de programmation en Semestre 3

### IUT Montpellier-Sète – Département Informatique

* **Enseignants :** [Nassim Belmecheri](mailto:nassim.belmecheri@umontpellier.fr), [Marin Bougeret](mailto:marin.bougeret@umontpellier.fr), [Nadjib Lazaar](mailto:nadjib.lazaar@umontpellier.fr), [Victor Poupet](mailto:victor.poupet@umontpellier.fr), [Gilles Trombettoni](mailto:gilles.trombettoni@umontpellier.fr), [Petru Valicov](mailto:petru.valicov@umontpellier.fr)
* **Enseignant responsable :** [Nassim Belmecheri](mailto:nassim.belmecheri@umontpellier.fr)
* Le [forum Piazza](https://piazza.com/class/kek1cuqz3ep7o?cid=6) de ce cours pour poser vos questions

# Projet - _AlgosGenetiques_

**Date de rendu : Le 15 décembre 2020 à 18h00**

**Avant de commencer à coder quoique ce soit, consultez les [Consignes](Consignes.md).**

## Présentation
Le but de ce projet est de produire une implémentation en _Java_ du jeu _Récolte de Piéces dans une grille_.
En plus de l'implémentation du jeu lui-même, on considèrera l'implémentation de deux intelligences artificielles : un algorithme naïf et l'algorithme minmax.

### Le jeu _Récolte de Piéces dans une Grille_

RPG est un jeu de grille ou on essaye de récolter le maximum de piéces possible en faisant k mouvements limités.

Nous vous fournissons un squelette de code à compléter dans lequel les méthodes seront spécifiées, ainsi que des [tests unitaires](https://fr.wikipedia.org/wiki/Test_unitaire).
Pour avoir un aperçu global du projet, voici des informations générales sur la structure du jeu et des classes fournies. 
En cas de détails non précisés dans les paragraphes ci-dessous, référez vous aux spécifications, ainsi qu'aux tests.

### Déroulement du jeu

Un agent commence depuis une case de depar cd et parcous les cases voisines pour recolter des piéces. il peut faire k pas seulement.

### Les classes importantes


#### `Instance` 

La classe `Instance` modélise l'instance du jeu, elle a comme attributs :
- la grille `plateau`
Exemple d'une grille : 
```
__0_1_2
0|X _ X
1|_ _ _
2|X _ X
```
- le point de départ `StartingPoint`
- le nombre de mouvements autorisés `k`
Une case de la grille est soit vide (`false`), soit rempli par un jeton (`true`) .

Voici quelques méthodes importantes de la classe `Instance` (dont certaines sont à implémenter) :
- piecePresente
- estValide
- evaluerSolution

#### `Coord` 
La classe `Coord` modélise les coordonnées de la grille du jeu, elle a comme attributs :
- une ligne `l`
- Une colonne `c`

Voici quelques méthodes importantes de la classe `Coord` (dont certaines sont à implémenter) :
- estDansPlateau
- estADistanceUn 
- distanceFrom
#### `IndividuGDHBSimple`
La classe `IndividuGDHBSimple` modélise Un Individu de type GDHB dans l'algorithme génétique, elle a comme attributs :
- L'instance du jeu `instance`
- le trajet de l'individu `trajet` (ex : DDDDHHHDDDBBB)

Voici quelques méthodes importantes de la classe `IndividuGDHBSimple` (dont certaines sont à implémenter) :
- calculerNextCoord
- calculerCroisement 
- calculerMutation
- calculerSolution
#### `IndividuGDHBSmartCrossing`
La classe `IndividuGDHBSmartCrossing` modélise Un Individu de type GDHB avec un croisement intelligent dans l'algorithme génétique, elle a comme attributs :
- L'instance du jeu `instance`
- le trajet de l'individu `trajet` (ex : DDDDHHHDDDBBB)

Voici quelques méthodes importantes de la classe `IndividuGDHBSmartCrossing` (dont certaines sont à implémenter) :
- calculerNextCoord
- calculerCroisement 
- calculerMutation
- calculerSolution
#### `IndividuGDHBSmartCrossingSmartMutation`
La classe `IndividuGDHBSmartCrossingSmartMutation` modélise Un Individu de type GDHB avec un croisement et une mutation plus intelligent dans l'algorithme génétique, elle a comme attributs :
- L'instance du jeu `instance`
- le trajet de l'individu `trajet` (ex : DDDDHHHDDDBBB)

Voici quelques méthodes importantes de la classe `IndividuGDHBSmartCrossingSmartMutation` (dont certaines sont à implémenter) :
- calculerNextCoord
- calculerCroisement 
- calculerMutation
- calculerSolution
#### `IndividuPermut`
La classe `IndividuPermut` modélise Un Individu de type Permutation dans l'algorithme génétique, elle a comme attributs :
- L'instance du jeu `instance`
- le trajet de l'individu `permutations` (ex : 1,2,10,5,7,3)

Voici quelques méthodes importantes de la classe `IndividuPermut` (dont certaines sont à implémenter) :
- plusCourtChemin
- calculerCroisement 
- calculerMutation
- calculerSolution

#### `CroisementMutationV1` 
Cette classe calcule la nouvelle generation depuis une population en faisent le croisement d'abord et ensuite la mutation
#### `CroisementMutationV2` 
Cette classe calcule la nouvelle generation depuis une population en faisent la mutation d'abord et ensuite le croisement

#### `AlgoGenetique` 
Cette classe déroule l'algorithme génétique.

#### L'interface `IIndividu`
L'interface `IIndividu` modélise les differents types d'individus.
#### L'interface `StrategieCalculNextGen`
L'interface `StrategieCalculNextGen` modélise les differentes strategies de calcule des prochaine générations.
#### L'interface `ICreator`
L'interface `ICreator` modélise les different createurs d'individus.





### Interface utilisateur
L'interface utilisateur que vous aurez à gérer sera entièrement en ligne de commandes. 
Les informations du jeu seront affichées à l'écran en utilisant la sortie standard et les choix algorithmique du joueur se feront par lecture sur l'entrée standard (clavier). 
Le jeu commence par l'exécution de `main` dans la classe `App`.
Une fois la partie lancée, toutes les interactions avec l'utilisateur se feront donc dans le terminal.


### Rendu attendu
Vous travaillerez par groupes de 3. L'intégralité du code source du projet doit résider dans le dépôt GitHub associé à votre équipe de projet **sur la branche master**. Veillez à vous répartir le travail, et à ce que chaque membre du groupe effectue des commits pour laisser une trace de son activité. On vous encourage à travailler sur des *branches* différentes pour chaque fonctionnalité/personne de l'équipe et fusionner les branhces avec master au fur et à mesure.

 Pour les modalités de rendu, voir les [Consignes](Consignes.md).

### Évaluation
Nous évaluerons votre projet dans l'état où il sera sur le dépôt GitHub de votre équipe au moment de la deadline.

Barème indicatif : si votre projet 
- ne compile pas : 0
- passe tous les tests "publiques" (ceux que vous avez) : 12
- passe tous les tests "publiques" et "privés" (pour l'algo qui vous est imposé) : 15
- passe tous les tests "publiques" et "privés" (pour d'autres stratégies) : 20

### Prise en compte de la note

La note comptera en partie dans le module Algorithmique Avancée (M3103) et le module Conception et Programmation Objet Avancées (M3105), de la façon suivante.

Algorithmique avancée (M3103) :
- 25% : contrôles de TD
- 25% : projet Conquest
- 50% : partiel

Conc. et Prog. Objet Avancées (M3105) :
- 30% : projet Conquest
- 20% : note de TD
- 80% : partiel
