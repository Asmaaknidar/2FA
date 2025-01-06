<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Dashboard</title>
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2>Welcome, <%= session.getAttribute("username") %></h2>  <!-- Affiche le nom d'utilisateur depuis la session -->
        <p>This is your dashboard.</p>
        <a href="LogoutServlet" class="btn btn-danger">Logout</a>  <!-- Lien pour se déconnecter -->
    </div>
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
</body>
</html>
