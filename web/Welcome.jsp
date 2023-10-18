<%-- 
    Document   : Welcome
    Created on : 10-Oct-2023, 13:12:29
    Author     : hp
--%>

<%@page import="ma.projet.classes.Client"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Inclure les fichiers Bootstrap via CDN -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page d'accueil</title>
    </head>
    <body>
        <%!Client c;%>
        <%

            HttpSession sessio = request.getSession();
            if (sessio != null) {
                c = (Client) sessio.getAttribute("client");
            } else {
                response.sendRedirect("Authentification.jsp");
            }
        %>
       

        <div class="d-flex justify-content-between">
            <div>
                <h2>Welcome : <%= c.getNom() + " " + c.getPrenom()%> </h2>

            </div>
            <div>
                <form action="Deconnexion">
                    <button class="btn btn-primary btn-md btn-block" type="submit" name="valider">Logout</button>
                </form>
            </div>
        </div>


    </body>
</html>
