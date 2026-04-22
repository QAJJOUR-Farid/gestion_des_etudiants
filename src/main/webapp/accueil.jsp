<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 4/16/2026
  Time: 11:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Accueil</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/styles.css">
</head>
<body>
<main class="page-shell">
    <section class="hero-card">
        <div class="topbar">
            <div>
                <p class="eyebrow">Tableau de bord</p>
                <h1 class="section-title">Bienvenue ${sessionScope.username}</h1>
                <p class="section-text">Accédez aux étudiants, ajoutez de nouveaux profils et mettez à jour les données rapidement.</p>
            </div>
            <div class="header-actions">
                <a class="btn-secondary btn" href="liste">Voir les étudiants</a>
                <a class="btn-link" href="logout">Se déconnecter</a>
            </div>
        </div>
        <div class="feature-grid">
            <article class="feature-card">
                <h3>Consultation</h3>
                <p>Affichez la liste complète avec un tableau lisible et des actions directes.</p>
            </article>
            <article class="feature-card">
                <h3>Ajout</h3>
                <p>Créez des fiches étudiants avec un formulaire plus clair et mieux espacé.</p>
            </article>
            <article class="feature-card">
                <h3>Mise à jour</h3>
                <p>Modifiez les informations existantes sans quitter l'interface d'administration.</p>
            </article>
        </div>
    </section>
</main>
</body>
</html>
