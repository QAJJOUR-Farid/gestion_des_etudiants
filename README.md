# Scolarité - Système de Gestion des Étudiants

Une application web Java robuste pour la gestion des inscriptions et des dossiers scolaires des étudiants.

## 🚀 Fonctionnalités
- **Gestion des Étudiants** : Ajout, modification, suppression et affichage de la liste des étudiants.
- **Authentification** : Système de connexion sécurisé pour les administrateurs.
- **Interface Moderne** : Pages JSP avec un design épuré et responsive.
- **API REST** : Intégration de Jersey pour les services web.

## 🛠️ Technologies Utilisées
- **Langage** : Java 21
- **Framework Web** : Jakarta Servlet 6.0 / JSP
- **API REST** : Jersey (JAX-RS)
- **Base de Données** : MySQL
- **Gestionnaire de Dépendances** : Maven
- **Style** : CSS3 (Vanille)

## 📋 Prérequis
- **JDK 21** ou supérieur.
- **Maven 3.8+**.
- **Serveur d'application** : Apache Tomcat 10+ (compatible Jakarta EE 10).
- **MySQL Server**.

## ⚙️ Configuration
1. **Base de données** :
   - Créez une base de données MySQL nommée `scolarite`.
   - Configurez les accès (URL, utilisateur, mot de passe) dans la classe `dao.EtudiantDAO`.

2. **Build** :
   ```bash
   mvn clean package
   ```

3. **Déploiement** :
   - Déployez le fichier `.war` généré dans le dossier `target/` sur votre serveur Tomcat.

## 📂 Structure du Projet
- `src/main/java` : Code source Java (Servlets, DAO, Modèles).
- `src/main/webapp` : Fichiers JSP, CSS et configuration WEB-INF.
- `pom.xml` : Configuration Maven et dépendances.

---
Développé avec ❤️ pour la gestion académique.
