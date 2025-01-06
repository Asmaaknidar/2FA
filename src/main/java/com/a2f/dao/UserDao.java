package com.a2f.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    // Informations pour se connecter à la base de données
    private String jdbcURL = "jdbc:mysql://localhost:3306/auth_module"; // Remplacez localhost et auth_module si nécessaire
    private String jdbcUsername = "root"; // Votre utilisateur MySQL
    private String jdbcPassword = "Asma@2003"; // Remplacez par votre mot de passe MySQL

    // Requête SQL pour valider un utilisateur
    private static final String SELECT_USER_QUERY = "SELECT * FROM users WHERE username = ? AND password = ?";

    // Méthode pour valider les identifiants utilisateur
    public boolean validate(String username, String password) {
        try {
            // Charger explicitement le driver JDBC pour MySQL
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            // Crée une connexion à la base de données
            Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);

            // Prépare la requête SQL
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_QUERY);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            // Exécute la requête et récupère le résultat
            ResultSet rs = preparedStatement.executeQuery();

            // Si un résultat existe, les informations sont valides
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
