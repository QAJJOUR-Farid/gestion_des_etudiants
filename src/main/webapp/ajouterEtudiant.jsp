<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 4/16/2026
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un étudiant</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/styles.css">
</head>
<body>
<main class="page-shell">
    <section class="form-card">
        <div class="page-header">
            <div>
                <p class="eyebrow">Création</p>
                <h1 class="section-title">Ajouter un étudiant</h1>
                <p class="section-text">Remplissez les informations principales avant validation.</p>
            </div>
            <a class="btn-link" href="liste">Retour à la liste</a>
        </div>
        <form action="ajouter" method="post" class="form-grid">
            <div class="field">
                <label for="nom">Nom</label>
                <input id="nom" type="text" name="nom">
            </div>
            <div class="field">
                <label for="prenom">Prénom</label>
                <input id="prenom" type="text" name="prenom">
            </div>
            <div class="field field-full">
                <label for="email">Email</label>
                <input id="email" type="email" name="email">
            </div>
            <div class="field">
                <label for="filiere">Filière</label>
                <input id="filiere" type="text" name="filiere">
            </div>
            <div class="field">
                <label for="niveau">Niveau</label>
                <input id="niveau" type="text" name="niveau">
            </div>
            <div class="field field-full">
                <input type="submit" value="Ajouter">
            </div>
        </form>
    </section>
</main>
</body>
</html>
