<%-- 
    Document   : registro
    Created on : 24-jun-2016, 20:02:49
    Author     : FrancoSebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>DAI CREDIT</h1>
        <form action="registro.htm" method="post">
            Rut<br>
            <input type="text" name="txtRut" required ><br>
            Nombre<br>
            <input type="text" name="txtNombre" required ><br>
            Apellido Paterno<br>
            <input type="text" name="txtApellidoPaterno" required ><br>
            Apellido Materno<br>
            <input type="text" name="txtApellidoMaterno" required ><br>
            Contraseña<br>
            <input type="password" name="txtPassword" required><br>
            Repetir Contraseña:<br>
            <input type="password" name="txtPassword2" required><br>
            <input type="submit" value="Registrarse">
        </form>
        <a href="/Registro.htm">Registro</a>
    </body>
</html>
