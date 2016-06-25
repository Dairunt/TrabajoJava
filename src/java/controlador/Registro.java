/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Usuarios;
import java.util.Locale;
import modelo.DaoUsuario;
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
    public String Registrar() {
        return "/registro";
    }
    @RequestMapping(method = RequestMethod.POST)
    public String Registrar(@RequestParam("txtRut") String rut,
            Model model) {
        return "registro";
    }

}
