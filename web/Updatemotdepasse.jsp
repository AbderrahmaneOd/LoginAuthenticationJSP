<%-- 
    Document   : Updatemotdepasse
    Created on : 10-Oct-2023, 20:01:46
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Inclure les fichiers Bootstrap via CDN -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Password</title>
    </head>
    <body>
        <section class="vh-100" style="background-color: #508bfc;">
            <div class="container py-5 h-100">
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col-12 col-md-8 col-lg-6 col-xl-5">
                        <div class="card shadow-2-strong" style="border-radius: 1rem;">
                            <div class="card-body p-5 text-center">
                                <form action="UpdateMdp"  method="POST">
                                    <h3 class="mb-5">Update Password</h3>

                                    <div class="form-outline mb-4">
                                        <input type="password" class="form-control form-control-md" name="password" value="" placeholder="Password"/>
                                    </div>
                                    
                                    <div class="form-outline mb-4">
                                        <input type="password" class="form-control form-control-md" name="passwordcnf" value="" placeholder="Confirm your password"/>
                                    </div>

                                    <div class="form-outline mb-4">
                                        <%
                                            if (request.getParameter("msg") != null) {%>
                                        <h3><%= request.getParameter("msg")%></h3>
                                        <%}%>
                                    </div>

                                    <button class="btn btn-primary btn-md btn-block" type="submit" name="valider">Update</button>

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
