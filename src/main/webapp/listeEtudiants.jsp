
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 4/16/2026
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Liste des étudiants</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/styles.css">
</head>
<body>
<main class="page-shell">
    <section class="content-card">
        <div class="page-header">
            <div>
                <p class="eyebrow">Gestion</p>
                <h1 class="section-title">Liste des étudiants</h1>
                <p class="section-text">Consultez, modifiez ou supprimez les étudiants depuis une seule vue.</p>
            </div>
            <div class="header-actions">
                <a class="btn" href="ajouterEtudiant.jsp">Ajouter un étudiant</a>
                <a class="btn-link" href="accueil.jsp">Retour accueil</a>
            </div>
        </div>
        <div class="table-wrapper">
            <table>
                <tr>
<%--                    <th>ID</th>--%>
                    <th>Nom</th>
                    <th>Prénom</th>
                    <th>Email</th>
                    <th>Filière</th>
                    <th>Niveau</th>
                    <th>Actions</th>
                </tr>
                <c:forEach var="e" items="${listeEtudiants}">
        <tr>
<%--                    <td>${e.id}</td>--%>
                    <td>${e.nom}</td>
                    <td>${e.prenom}</td>
                    <td>${e.email}</td>
                    <td>${e.filiere}</td>
                    <td><span class="badge">${e.niveau}</span></td>
                    <td>
                        <div class="inline-actions">
                            <a class="btn-secondary btn" href="modifier?id=${e.id}">Modifier</a>
                            <a class="btn-danger btn" href="supprimer?id=${e.id}">Supprimer</a>
                        </div>
                    </td>
        </tr>
                </c:forEach>
            </table>
        </div>
    </section>
</main>
</body>
</html>
