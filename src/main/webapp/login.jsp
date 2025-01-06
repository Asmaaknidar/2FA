<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion</title>
</head>
<body>
    <div style="max-width: 400px; margin: 50px auto; text-align: center;">
        <h2>Connexion</h2>
        <!-- Formulaire de connexion -->
        <form action="LoginServlet" method="POST" style="margin-top: 20px; text-align: left;">
            <!-- Champ Nom d'utilisateur -->
            <div style="margin-bottom: 15px;">
                <label for="username" style="display: block; margin-bottom: 5px;">Nom d'utilisateur</label>
                <input type="text" id="username" name="username" required style="width: 100%; padding: 10px; box-sizing: border-box;">
            </div>
            <!-- Champ Mot de passe -->
            <div style="margin-bottom: 15px;">
                <label for="password" style="display: block; margin-bottom: 5px;">Mot de passe</label>
                <input type="password" id="password" name="password" required style="width: 100%; padding: 10px; box-sizing: border-box;">
            </div>
            <!-- Bouton Se connecter -->
            <button type="submit" style="padding: 10px 20px; background-color: #007bff; color: #fff; border: none; border-radius: 5px; cursor: pointer;">Se connecter</button>
        </form>
    </div>
</body>
</html>
