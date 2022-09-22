package com.Java.com.CRUDJAVA.controller;


import com.Java.com.CRUDJAVA.model.Empresa;
import com.Java.com.CRUDJAVA.service.EmpresaService;
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
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping("/emp")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        log.info("ejecutando el controlador Principal");
        return "principal";
    }

    @GetMapping("/empresas")
    public String principal(Model model,  @AuthenticationPrincipal User user){
        var empresas = empresaService.listaEmpresas();
        log.info("ejecutando el controlador Empresas");
        log.info("Usuario que hizo login: " + user);
        model.addAttribute("empresas", empresas);
        model.addAttribute("totalEmpresas", empresas.size());
        return "homeEmpresa";
    }

    @GetMapping("/agregarEmpre")
    public String agregar(Empresa empresa){
        return "modificarEmpre";
    }

    @PostMapping("/guardarEmpre")
    public String guardar(Empresa empresa){
        empresaService.guardar(empresa);
        return  "redirect:/empresas";
    }
    @GetMapping("/editarEmpre/{id}")
    public String editar(Empresa empresa, Model model){
        empresa = empresaService.buscar(empresa);
        model.addAttribute("empresa", empresa);
        return "modificarEmpre";
    }

    @GetMapping("/eliminarEmpre")
    public String eliminar(Empresa empresa){
        empresaService.eliminar(empresa);
        return "redirect:/empresas";
    }
}
