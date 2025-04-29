# Devoir 10 : Gestion d'une bibliothèque en ligne

## Objectifs

- Entraînement à la lecture et à la retranscription en Java d'informations fournies textuellement.
- Entraînement à de l'algorithmique simple (révision module 319).
- Révision de l'ensemble des concepts vus en classe.
- **Bonne préparation à la E1 à venir**.

## Durée

Vous devriez être en mesure de réaliser l'ensemble des fonctionnalités décrites ci-dessous en **1h à 1h30** maximum.

## Mission

- Retranscrivez avec précision les explications ci-dessous dans votre projet Java afin d'obtenir une application fonctionnelle.
- Veillez à respecter les enseignements reçus à l'EMF (classes dans les bons packages, ordre des choses dans vos classes, choix des noms, ...).

## Contexte général

Vous avez été chargé de développer un système de gestion pour une bibliothèque en ligne. L'objectif est de créer une application Java qui permettra aux utilisateurs de rechercher des livres, de les emprunter et de les retourner.

## Indications fournies

Un livre aura un titre, un auteur, un numéro ISBN unique et un statut (disponible ou emprunté). Les informations sur un livre ne pourront pas être modifiées, à l'exception du statut. L'affichage d'un livre devra produire un résultat ressemblant à ceci : "Titre: Harry Potter et la Chambre des Secrets, Auteur: J.K. Rowling, ISBN: 9782070624521, Statut: Disponible".

Par l'entremise du savoir-faire de votre bibliothèque, votre application devra permettre de rechercher un livre par son titre ou par son auteur, d'afficher tous les livres disponibles dans la bibliothèque, d'afficher tous les livres empruntés, d'emprunter un livre en utilisant son numéro ISBN, de restituer un livre emprunté en utilisant son numéro ISBN, d'afficher tous les livres de la bibliothèque qu'ils soient disponibles ou empruntés.

Dans votre main(), créez un tableau avec 5 livres avec les caractéristiques suivantes :

```text
Titre: Harry Potter à l'école des sorciers, Auteur: J.K. Rowling, ISBN: 9782070643027, Statut: Disponible
Titre: Le Seigneur des Anneaux : La Communauté de l'Anneau, Auteur: J.R.R. Tolkien, ISBN: 9782266283611, Statut: Disponible
Titre: 1984, Auteur: George Orwell, ISBN: 9782070345096, Statut: Disponible
Titre: Le Petit Prince, Auteur: Antoine de Saint-Exupéry, ISBN: 9782070628642, Statut: Emprunté
Titre: To Kill a Mockingbird, Auteur: Harper Lee, ISBN: 9780061120084, Statut: Disponible
```

Réaliser ensuite toutes les opérations sur vos livres et afficher le résultat des opérations sur la console.

## RESTITUTION

1. Rendre ce devoir normalement par `push` GitHub
