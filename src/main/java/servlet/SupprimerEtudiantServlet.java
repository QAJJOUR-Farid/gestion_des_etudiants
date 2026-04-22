package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.EtudiantDAO;

import java.io.IOException;

@WebServlet("/supprimer")
public class SupprimerEtudiantServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id =  Integer.parseInt(request.getParameter("id"));
        EtudiantDAO dao = new EtudiantDAO();

        dao.deleteEtudiant(id);
        response.sendRedirect(request.getContextPath() + "/liste");
    }
}
