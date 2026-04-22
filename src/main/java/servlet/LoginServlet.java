package servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request , HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request, response);

    }
    protected void doPost(HttpServletRequest request , HttpServletResponse response)
            throws ServletException, IOException{

        String username = request.getParameter("username");
        String password =request.getParameter("password");

        if (username == null || username.trim().isEmpty() ||
            password == null || password.trim().isEmpty()){

          response.sendRedirect(request.getContextPath() + "/login.html?error=2");
        }

        if("admin".equals(username) && "123".equals(password)){

            HttpSession session = request.getSession(true);
            session.setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + "/accueil.jsp");
        }else{
            response.sendRedirect(request.getContextPath() + "/login.jsp?error=invalid");
        }
    }
}
