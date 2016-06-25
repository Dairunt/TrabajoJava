<%-- 
    Document   : nuevaPostulacion
    Created on : 24-jun-2016, 21:07:38
    Author     : FrancoSebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de Postulante</title>
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        <script type="text/javascript">
        $(function () 
        {
            $("#chkHijos").click(function () 
            {
                if ($(this).is(":checked")) 
                {
                    $("#txtHijos").removeAttr("disabled");
                    $("#txtHijos").focus();
                }
                else
                {
                    $("#txtHijos").attr("disabled", "disabled");
                }
            });
        });
</script>
    </head>
    <body>
        <h1>Formulario de preinscripción</h1>
        <form action="nuevaPostulacion.htm" method="post">
        <table border="1">   
            <tr>
                <td>RUT</td>                
                <td><input type="text" name="txtRut" size=12/></td>
                <td>Teléfono</td>
                <td><input type="text" name="txtTelefono"/></td>
            </tr>            
            <tr>
                <td>Nombre</td>
                <td><input type="text" name="txtNombre"/></td>
                <td>E-Mail</td>
                <td><input type="text" name="txtEmail"/></td>
            </tr>
            <tr>
                <td>Apellido Paterno</td>
                <td><input type="text" name="txtPaterno"/></td>
                <td>Dirección</td>
                <td><input type="text" name="txtDireccion"/></td>
            </tr>
            <tr>
                <td>Apellido Materno</td>
                <td><input type="text" name="txtMaterno"/></td>
                <td>Comuna</td>
                <td><select name="lstComuna">
                   
                 </select></td>
            </tr>
            <tr>
                <td>Fecha Nacimiento</td>
                <td><input type="date" name="txtFecha"/></td>
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
                <td><input type="number" name="txtSueldo"/></td>
            </tr>
            <tr>    
                <td>Hijos</td>
                <td><label for="chkHijos">
                    <input type="checkbox" id="chkHijos" name="chkHijos" value="Tiene"/>
                </label>
                Cantidad:
                <input type="number" id="txtHijos" name="txtHijos" />
                <td> ¿Padece alguna <br> enfermedad crónica?</td>
                <td> <input type="checkBox" name="chkEnfermedad" value="Si"/> Si </td>
            </tr>
            <input type="submit" value="Enviar"/>
        </form>
    </body>
</html>
