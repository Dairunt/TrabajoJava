/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.Usuarios;
import modelo.DaoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author FrancoSebastian
 */
@Controller
@RequestMapping("/login.htm")
public class Login {
    @Autowired
    private DaoUsuario dao;  
    @RequestMapping(method = RequestMethod.POST)    
    public String loginMethod(@RequestParam("txtRut") String rut, 
            @RequestParam("txtPassword") String password,
            Model model){
            Usuarios usuario = new Usuarios();
            DaoUsuario dao= new DaoUsuario();
            usuario = dao.findByRutAndPassword(rut, password);
            if (usuario == null) {
                return "index";
            }else{     
            model.addAttribute("usuarioAutenticado", usuario);
            }         
            return "mostrarRut";
    }
}
