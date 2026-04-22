package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.EtudiantDAO;
import model.Etudiant;

import java.io.IOException;

@WebServlet("/modifier")
public class ModifierEtudiantServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        EtudiantDAO dao = new EtudiantDAO();

        request.setAttribute("etudiant",dao.getEtudiantById(id));
        request.getRequestDispatcher("/modifierEtudiant.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EtudiantDAO dao = new EtudiantDAO();

        Etudiant e = new Etudiant();
        e.setId(Integer.parseInt(request.getParameter("id")));
        e.setNom(request.getParameter("nom"));
        e.setPrenom(request.getParameter("prenom"));
        e.setEmail(request.getParameter("email"));
        e.setFiliere(request.getParameter("filiere"));
        e.setNiveau(Integer.parseInt(request.getParameter("niveau")));

        dao.updateEtudiant(e);
        response.sendRedirect(request.getContextPath() + "/liste");
    }
}
