package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@SuppressWarnings("serial")
@WebServlet("/LogoutServlet") // L'URL pour accéder à cette servlet
public class LogoutServlet extends HttpServlet {

    // Méthode doGet pour gérer la déconnexion
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Invalider la session de l'utilisateur pour le déconnecter
        request.getSession().invalidate();

        // Rediriger vers la page d'accueil ou de connexion après la déconnexion
        response.sendRedirect("index.html");  // Redirection vers la page d'accueil
    }
}

