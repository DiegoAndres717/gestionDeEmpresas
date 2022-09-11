package com.Java.com.CRUDJAVA.controller;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Mensaje;
import com.Java.com.CRUDJAVA.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping ("/buscar/empleados")
    public List<Empleado> mostrarEmpleados(){

        return empleadoService.mostrarEmpleado();
    }

    @GetMapping ("/empleado/{id}")
    public ResponseEntity<Empleado> buscarEmpleado(@PathVariable("id") Long id){
        if (!empleadoService.existsByIdEmpleado(id)){
            return new ResponseEntity(new Mensaje("No existe el  empleado"), HttpStatus.NOT_FOUND);
        }else {
            Empleado empleado = empleadoService.getEmpleado(id).get();
            return new ResponseEntity(empleado, HttpStatus.OK);
        }

    }

    @PostMapping (path = "/insertarEmpleadoJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity <Boolean> insertarPersona (@RequestBody Empleado empleado){

        return new ResponseEntity<Boolean>(empleadoService.insertarPersonaJPA(empleado), HttpStatus.OK)  ;
    }
    @PutMapping (path = "/actualizarTodoJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> actualizarTodoJPA (@RequestBody Empleado empleado){

        return new ResponseEntity<Boolean> (empleadoService.actualizarTodoJPA(empleado), HttpStatus.OK);

    }

    @DeleteMapping("/borrarEmpleadoJPA/{id}")
    public void borrarPersonaJPA(@PathVariable("id") Long id) {
        empleadoService.deleteEmpleadoById(id);
    }
}
