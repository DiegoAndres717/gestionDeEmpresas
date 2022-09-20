package com.Java.com.CRUDJAVA.controller;

import com.Java.com.CRUDJAVA.Dao.TransaccionDao;
import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Transaccion;
import com.Java.com.CRUDJAVA.service.EmpleadoService;
import com.Java.com.CRUDJAVA.service.TransaccionService;
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
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @GetMapping("/tr")
    public String inicio(Model model, @AuthenticationPrincipal User user){
        log.info("ejecutando el controlador Principal");
        return "principal";
    }

    @GetMapping("/tran")
    public String principal(Model model,  @AuthenticationPrincipal User user){
        var transacciones = transaccionService.listaTran();
        log.info("ejecutando el controlador Transacciones");
        var totalMonto= 0D;
        for (var p: transacciones){
            totalMonto += Double.parseDouble(p.getMonto());
        }
        model.addAttribute("totalMonto", totalMonto);
        model.addAttribute("totalTransacciones", transacciones.size());
        return "index1";
    }

    @GetMapping("/agregarTran")
    public String agregar(Transaccion transaccion){
        return "modificar";
    }

    @PostMapping("/guardarTran")
    public String guardar(Transaccion transaccion){
        transaccionService.guardarTran(transaccion);
        return  "redirect:/";
    }
    @GetMapping("/editarTran/{id}")
    public String editar(Transaccion transaccion, Model model){
        transaccion = transaccionService.buscarTran(transaccion);
        model.addAttribute("transaccion", transaccion);
        return "modificar";
    }

    @GetMapping("/eliminarTran")
    public String eliminar(Transaccion transaccion){
        transaccionService.eliminarTran(transaccion);
        return "redirect:/";
    }
}
