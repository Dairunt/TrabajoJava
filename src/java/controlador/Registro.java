/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Usuarios;
import java.util.Locale;
import modelo.DaoUsuario;
import modelo.ServicioException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Registro.htm")
public class Registro {

    @Autowired
    private DaoUsuario dao;

    @RequestMapping(method = RequestMethod.GET)
    public String registro() {
        return "registro";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String registro(@RequestParam("txtRut") String rut,
            @RequestParam("txtNombre") String nombre,
            @RequestParam("txtPaterno") String paterno,
            @RequestParam("txtMaterno") String materno,
            @RequestParam("txtPassword") String password,
            @RequestParam("txtPassword2") String password2,
            Model model) throws ServicioException {

        Usuarios usuario = new Usuarios();
        usuario.setNombre(nombre);
        usuario.setApellidoPaterno(paterno);
        usuario.setApellidoMaterno(materno);
        usuario.setPassword(password);
        usuario.setRut(rut);
        
        DaoUsuario daoUsuario = new DaoUsuario();
        daoUsuario.create(usuario);
        return "index";
    }

}
