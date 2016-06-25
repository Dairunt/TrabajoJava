<%-- 
    Document   : verPostulacion
    Created on : 24-jun-2016, 21:12:37
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
        <h1>Ver Postulacion </h1>
        
        <table border="1">   
            <tr>
                <td>RUT</td>                
                <td><input type="text" name="txtRut" size=12 value="${requestScope.datosPersona.rut}"/></td>
                <td>Teléfono</td>
                <td><input type="text" name="txtTelefono" value="${requestScope.datosPersona.telefono}"/></td>
            </tr>            
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="txtNombre" value="${requestScope.datosPersona.nombre}"/></td>
                <td>E-Mail</td>
                <td><input type="text" name="txtEmail" value="${requestScope.datosPersona.rut}"></td>
            </tr>
            <tr>
                <td>Apellido Paterno</td>
                <td><input type="text" name="txtPaterno" value="${requestScope.datosPersona.paterno}"/></td>
                <td>Dirección</td>
                <td><input type="text" name="txtDireccion" value="${requestScope.datosPersona.direccion}"/></td>
            </tr>
            <tr>
                <td>Apellido Materno</td>
                <td><input type="text" name="txtMaterno" value="${requestScope.datosPersona.materno}"/></td>
                <td>Comuna</td>
                <td><select name="lstComuna">
                   
                 </select></td>
            </tr>
            <tr>
                <td>Fecha Nacimiento</td>
                <td><input type="date" name="txtFecha" value="${requestScope.datosPersona.fechanacimiento}"/> </td>
                <td>Educación</td>
                <td><select name="lstEducacion">
                </select></td>
            </tr>
            <tr>
                <td>Sexo</td>
                <td>
                    <input type="radio" name="btnSexo" value="Masculino">Masculino
                    <input type="radio" name="btnSexo" value="Femenino">Femenino
                </td>
                <td>Renta</td>
                <td><select name="lstRenta">
                </select></td>
            </tr>
            <tr>
                <td>Estado Civil</td>
                <td><select name="lstCivil">
                </select></td>
                <td>Sueldo Líquido</td>
                <td><input type="number" name="txtSueldo" value="${requestScope.datosPersona.materno}"/></td>
            </tr>
            <tr>    
                <td>Hijos</td>
                <td><label for="chkHijos">
                    <input type="checkbox" id="chkHijos" name="chkHijos" value="Tiene"/>
                </label>
                Cantidad:
                <input type="number" id="txtHijos" name="txtHijos" value="${requestScope.datosPersona.hijos}" />
                <td> ¿Padece alguna <br> enfermedad crónica?</td>
                <td> <input type="checkBox" name="chkEnfermedad" value="Si"/> Si </td>
            </tr>
            </table>
   </body>
</html>
