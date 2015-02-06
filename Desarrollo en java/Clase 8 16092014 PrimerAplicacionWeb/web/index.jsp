<%-- 
    Document   : index
    Created on : 16-09-2014, 01:13:24 PM
    Author     : Clases
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <a href="mostrar.jsp">vinculo a pagina mostrar.jsp</a><br><br>
        
        <form action="ProcesarSolicitud" id="formLogin" method="post">
        <label>Usuario</label><input type="text" name="txtUsuario"/><br>
        <label>Password</label><input type="password" name="txtPass"/><br>
        <input type="submit" name ="btnEnviar" value="Enviar"/>
        </form>
        
    </body>
</html>
