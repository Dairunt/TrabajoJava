<%-- 
    Document   : verPostulaciones
    Created on : 24-jun-2016, 21:07:45
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
        <h1>Ver Postulaciones</h1>
        <table style="width:100%">
            <tr>
                <th>Rut</th>
                <th>Nombre</th> 
                <th>Estado</th>
                <th>Opciones</th>
            </tr>
            <c:forEach var="f" items="${requestScope.listaPostulaciones}">
                <tr>
                    <td>${f.rut}</td>
                    <td>${f.nombre}</td>
                    <td>${f.estado}</td>
                    <td><a href="verPostulacion?id="${f.id}>Ver</a>
                        <a href="editarPostulacion?id="${f.id}>Editar</a>
                        <a href="eliminarPostulacion?id="${f.id}>Eliminar</a>
                    </td>
                </tr>
            </c:forEach>
    </body>
</html>
