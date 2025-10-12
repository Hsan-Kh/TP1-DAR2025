TP1-DAR2025 – Sockets en mode connecté TCP

Informations sur le projet

Auteur : Hsan Khecharem

Filière : Licence en Sciences de l’Informatique

Spécialité : Génie Logiciel et Systèmes d’Information

Faculté : Faculté des Sciences de Sfax

Projet : Client/Serveur – Service de calculatrice

Description du TP

Ce TP a pour objectif de familiariser l’étudiant avec le développement d’applications réparties en Java utilisant des sockets TCP. Il consiste à concevoir une application Client/Serveur capable de communiquer de manière fiable pour effectuer des traitements côté serveur, ici un service de calculatrice. Le TP permet de comprendre la gestion des flux de données, la communication bidirectionnelle, la configuration des adresses IP et ports, et l’adaptation du code pour fonctionner sur un ordinateur local ou sur deux machines distinctes sur le même réseau local.

📂 Structure du repository

main/ : README général 

Activité_1_1/ : Client/Serveur basique (multiplication simple)

Activité_1_2/ : Extension pour calcul côté serveur sur le même PC

Activité_1_3/ : Calculatrice complète, communication possible sur deux machines

💻 Environnement

Java JDK 1.8

IDE : Eclipse

📝 Description générale des activités

Activité 1-1 : Client/Serveur basique

Client envoie un entier au serveur

Serveur multiplie l’entier par 2 et renvoie le résultat

Communication bidirectionnelle avec DataInputStream et DataOutputStream

Fermeture correcte des flux et de la socket

Activité 1-2 : Calcul côté serveur sur le même PC

Extension de l’activité 1-1

Client et serveur communiquent via localhost

Transmission fiable d’entiers de n’importe quelle taille

Serveur capable de traiter les données avant de renvoyer le résultat

Activité 1-3 : Calculatrice améliorée

Service complet avec 4 opérations : addition, soustraction, multiplication, division

Menu interactif côté client pour sélectionner l’opération

Communication bidirectionnelle avec TCP

Adaptation pour exécution sur deux machines distinctes via IP locale

Utilisation de InetAddress et InetSocketAddress pour gérer adresses et ports

Fermeture correcte des flux et de la socket après chaque communication

🛠️ Fonctionnalités clés

Transmission fiable des entiers et doubles via DataInputStream / DataOutputStream

Gestion des flux et des sockets avec fermeture correcte pour libérer les ressources

Communication TCP bidirectionnelle

Menu interactif pour sélectionner l’opération côté client

Serveur capable d’effectuer les calculs avant d’envoyer le résultat

📌 Résultats attendus

Le serveur affiche les connexions et les calculs effectués

Le client reçoit et affiche correctement le résultat

Les quatre opérations de la calculatrice fonctionnent correctement

L’application fonctionne en local et peut être adaptée pour deux machines sur le même réseau
