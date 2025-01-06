package com.a2f.dao;

public class test {
    public static void main(String[] args) {
        // Crée une instance de UserDao
        UserDao userDao = new UserDao();

        // Tester un utilisateur existant (remplacez ces valeurs par des données réelles dans votre base)
        String username = "admin";  // Remplacez par un utilisateur réel dans votre base de données
        String password = "admin1234";  // Remplacez par un mot de passe réel pour l'utilisateur

        // Tester la validation
        boolean isValid = userDao.validate(username, password);
        
        // Afficher le résultat du test
        if (isValid) {
            System.out.println("Utilisateur authentifié avec succès.");
        } else {
            System.out.println("Échec de l'authentification. Nom d'utilisateur ou mot de passe incorrect.");
        }
    }
}
