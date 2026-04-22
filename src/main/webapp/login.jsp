<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 4/16/2026
  Time: 11:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/styles.css">
</head>
<body>
<main class="auth-layout">
    <section class="auth-card">
        <div>
            <p class="eyebrow">Administration</p>
            <h1 class="section-title">Connexion</h1>
            <p class="section-text">Entrez vos identifiants pour accéder à la gestion des étudiants.</p>
        </div>
        <form action="login" method="post" class="form-grid">
            <div class="field field-full">
                <label for="username">Nom d'utilisateur</label>
                <input id="username" type="text" name="username" placeholder="admin">
            </div>
            <div class="field field-full">
                <label for="password">Mot de passe</label>
                <input id="password" type="password" name="password" placeholder="Votre mot de passe">
            </div>
            <div class="field field-full">
                <input type="submit" value="Se connecter">
            </div>
        </form>
        <p class="message-error">${error}</p>
    </section>
</main>
</body>
</html>
