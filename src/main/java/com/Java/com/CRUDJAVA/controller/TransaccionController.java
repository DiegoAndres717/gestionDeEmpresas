package com.Java.com.CRUDJAVA.controller;

import com.Java.com.CRUDJAVA.model.Mensaje;
import com.Java.com.CRUDJAVA.model.Transaccion;
import com.Java.com.CRUDJAVA.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api1")
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @GetMapping("/buscar/transaccion")
    public List<Transaccion> mostrarTransacciones(){

        return transaccionService.mostrarTransaccion();
    }

    @GetMapping ("/transaccion/{id}")
    public ResponseEntity<Transaccion> buscarTransaccion(@PathVariable("id") Long id){
        if (!transaccionService.existsByIdTransaccion(id)){
            return new ResponseEntity(new Mensaje("No existe el  empleado"), HttpStatus.NOT_FOUND);
        }else {
            Transaccion transaccion = transaccionService.getTransaccion(id).get();
            return new ResponseEntity(transaccion, HttpStatus.OK);
        }

    }

    @PostMapping(path = "/insertarTransaccionJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Boolean> insertarTransaccion (@RequestBody Transaccion transaccion){

        return new ResponseEntity<Boolean>(transaccionService.insertarTransaccionJPA(transaccion), HttpStatus.OK)  ;
    }
    @PutMapping(path = "/actualizarTodoJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> actualizarTodoJPA (@RequestBody Transaccion transaccion){

        return new ResponseEntity<Boolean> (transaccionService.actualizarTodoJPA(transaccion), HttpStatus.OK);

    }

    @DeleteMapping("/borrarTransaccionJPA/{id}")
    public void borrarTransaccionJPA(@PathVariable("id") Long id) {
        transaccionService.deleteTransaccionById(id);
    }
}
