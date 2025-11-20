# TP1-DAR2025 – Sockets en mode connecté TCP

## Informations sur le projet

**Auteur** : Hsan Khecharem  
**Filière** : Licence en Sciences de l’Informatique  
**Spécialité** : Génie Logiciel et Systèmes d’Information  
**Faculté** : Faculté des Sciences de Sfax  
**Sujet** : Architecture Client/Serveur – Service de calculatrice

---

## Description

Ce travail pratique a pour objectif la mise en œuvre d'une application répartie en Java reposant sur les sockets TCP. Le projet consiste à développer un service de calculatrice fonctionnant sur une architecture Client/Serveur.

Il permet d'aborder les concepts fondamentaux suivants :
*   Établissement d'une connexion fiable (TCP).
*   Gestion des flux de données (Input/Output Streams).
*   Communication bidirectionnelle synchrone.
*   Configuration réseau (Adresses IP et Ports) pour un déploiement local ou sur deux machines distinctes.

## Environnement de développement

*   **Langage** : Java (JDK 1.8)
*   **IDE** : Eclipse
*   **Protocole** : TCP/IP

## Structure du projet

L'arborescence du projet est organisée par activités progressives :

*   **main/** : Documentation générale.
*   **Activité_1_1/** : Version initiale (Client/Serveur basique pour multiplication).
*   **Activité_1_2/** : Extension pour traitement côté serveur (Localhost).
*   **Activité_1_3/** : Version finale (Calculatrice complète multi-machines).

## Détail des Activités

### Activité 1-1 : Client/Serveur basique
Implémentation d'une connexion simple pour comprendre le cycle de vie d'une socket.
*   Le client envoie un entier au serveur.
*   Le serveur multiplie l'entier par 2 et renvoie le résultat.
*   Utilisation de `DataInputStream` et `DataOutputStream`.

### Activité 1-2 : Calcul côté serveur (Local)
Amélioration de la logique de traitement sur la machine locale (`localhost`).
*   Transmission fiable d'entiers sans limitation de taille standard.
*   Le serveur centralise la logique de calcul avant de renvoyer la réponse.

### Activité 1-3 : Calculatrice Améliorée (Réseau)
Développement d'un service complet supportant les 4 opérations arithmétiques (Addition, Soustraction, Multiplication, Division).
*   **Côté Client** : Interface console interactive permettant de sélectionner l'opération et de saisir les nombres.
*   **Côté Serveur** : Réception de l'opérateur et des opérandes, exécution du calcul et renvoi du résultat.
*   **Réseau** : Utilisation des classes `InetAddress` et `InetSocketAddress` pour permettre la communication entre deux machines distinctes sur le même réseau local.
*   **Gestion des ressources** : Fermeture explicite des flux et des sockets après chaque transaction pour libérer les ressources système.

## Spécifications Techniques

L'application met en œuvre les mécanismes suivants :
*   **Flux** : Sérialisation des types primitifs (`int`, `double`) via les flux de données Java.
*   **Adressage** : Configuration dynamique ou statique des IP pour l'interopérabilité réseau.
*   **Robustesse** : Gestion des connexions et des erreurs d'entrée/sortie.

## Instructions d'exécution

1.  **Serveur** : Lancer d'abord le programme côté serveur. Il restera en écoute sur le port configuré.
2.  **Client** : Lancer le programme côté client.
    *   Si exécution sur la même machine : utiliser `localhost`.
    *   Si exécution sur deux machines : saisir l'adresse IP de la machine hébergeant le serveur.
