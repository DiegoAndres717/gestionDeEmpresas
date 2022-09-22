package com.Java.com.CRUDJAVA.controller;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.service.EmpleadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        log.info("ejecutando el controlador Principal");
        return "principal";
    }

    @GetMapping("/usuarios")
    public String principal(Model model,  @AuthenticationPrincipal User user){
        var empleados = empleadoService.listaPersonaas();
        log.info("ejecutando el controlador Spring MVC");
        log.info("Usuario que hizo login: " + user);
        model.addAttribute("empleados", empleados);
        model.addAttribute("totalUsuarios", empleados.size());
        return "homeUsuario";
    }

    @GetMapping("/agregar")
    public String agregar(Empleado empleado){
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Empleado empleado){
        empleadoService.guardar(empleado);
        return  "redirect:/usuarios";
    }
    @GetMapping("/editar/{idEmpleado}")
    public String editar(Empleado empleado, Model model){
        empleado = empleadoService.buscar(empleado);
        model.addAttribute("empleado", empleado);
        return "modificar";
    }

    @GetMapping("/eliminar")
    public String eliminar(Empleado empleado){
        empleadoService.eliminar(empleado);
        return "redirect:/usuarios";
    }

}
