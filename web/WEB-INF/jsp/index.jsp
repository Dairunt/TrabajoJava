<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido a DAICredit</title>
    </head>

    <body>
        <h1>DAI CREDIT</h1>
        <form action="login.htm" method="post">
         Rut<br>
         <input type="text" name="txtRut" required ><br>
         Password:<br>
         <input type="password" name="txtPassword" required><br>
         <input type="submit" value="Entrar">
        </form>
        <a href="registro.jsp">Registro</a>
    </body>
</html>
