<%-- 
    Document   : buscarPostulacion
    Created on : 24-jun-2016, 21:13:39
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
        <h1>Buscador Solicitudes</h1> <br>
        <h4>Busqueda por rut</h1> <br>
        <form action="login.htm" method="post">
         Rut<br>
         <input type="text" name="txtRut" required maxlength="12" ><br>
         <input type="submit" value="Buscar">
        </form>
        <h4>Busqueda por fecha</h1> <br>
        <form action="login.htm" method="post">
         Desde<br>
         <input type="date" name="txtInicio" required><br>
         Hasta<br>
         <input type="date" name="txtInicio" required><br>
         <input type="submit" value="Buscar">
        </form>
        
    </body>
</html>
