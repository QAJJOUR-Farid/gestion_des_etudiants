<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Scolarite</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/styles.css">
</head>
<body>
<main class="page-shell">
    <section class="hero-card">
        <p class="eyebrow">Plateforme de gestion</p>
        <h1 class="hero-title"><%= "Bienvenue dans Scolarité" %></h1>
        <p class="lead">
            Gérez vos étudiants dans une interface plus claire, plus lisible et mieux structurée.
            Accédez rapidement à l'authentification puis à l'espace d'administration.
        </p>
        <div class="actions">
            <a class="btn" href="login">Se connecter</a>
<%--            <a class="btn-link" href="liste">Voir les étudiants</a>--%>
        </div>
        <div class="stats-grid">
            <article class="stat-card">
                <span class="stat-value">JSP</span>
                <p class="stat-label">Pages plus propres et cohérentes</p>
            </article>
            <article class="stat-card">
                <span class="stat-value">CRUD</span>
                <p class="stat-label">Accès rapide aux opérations principales</p>
            </article>
            <article class="stat-card">
                <span class="stat-value">Responsive</span>
                <p class="stat-label">Lecture fluide sur mobile et desktop</p>
            </article>
        </div>
    </section>
</main>
</body>
</html>
