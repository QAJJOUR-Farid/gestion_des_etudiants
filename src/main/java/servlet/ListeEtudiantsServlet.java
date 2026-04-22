package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import dao.EtudiantDAO;
import jakarta.servlet.*;


import java.io.IOException;


@WebServlet("/liste")
public class ListeEtudiantsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EtudiantDAO dao = new EtudiantDAO();
        request.setAttribute("listeEtudiants", dao.getAllEtudiants());
        request.getRequestDispatcher("listeEtudiants.jsp").forward(request,response);
    }
}
