package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Etudiant;
import dao.EtudiantDAO;

import java.io.IOException;

@WebServlet("/ajouter")
public class AjouterEtudiantServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        EtudiantDAO dao = new EtudiantDAO();

        Etudiant e = new Etudiant();
        e.setNom(request.getParameter("nom"));
        e.setPrenom(request.getParameter("prenom"));
        e.setEmail(request.getParameter("email"));
        e.setFiliere(request.getParameter("filiere"));
        e.setNiveau(Integer.parseInt(request.getParameter("niveau")));

        dao.addEtudiant(e);
        response.sendRedirect(request.getContextPath() + "/liste");
    }
}
