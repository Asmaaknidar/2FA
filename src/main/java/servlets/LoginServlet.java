package servlets;  // Assurez-vous que le package est correctement défini

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.a2f.dao.UserDao; // Vous aurez besoin d'importer la classe UserDao
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/LoginServlet")  // Cette annotation définit l'URL à laquelle ce servlet répond
public class LoginServlet extends HttpServlet {

    // La méthode doPost est appelée lorsque le formulaire de connexion est soumis en POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les paramètres du formulaire (nom d'utilisateur et mot de passe)
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Créer une instance de UserDao pour interagir avec la base de données
        UserDao userDao = new UserDao();

        // Valider l'utilisateur via la méthode validate() de UserDao
        if (userDao.validate(username, password)) {
            // Si l'utilisateur est valide, créer une session et rediriger vers le tableau de bord
            request.getSession().setAttribute("username", username);
            response.sendRedirect("dashboard.jsp");
        } else {
            // Si l'utilisateur est invalide, rediriger vers la page de connexion avec un message d'erreur
            response.sendRedirect("login.jsp?error=1");
        }
    }
}


