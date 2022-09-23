//package com.Java.com.CRUDJAVA.controller;
//
//import com.Java.com.CRUDJAVA.model.Mensaje;
//import com.Java.com.CRUDJAVA.model.Perfil;
//import com.Java.com.CRUDJAVA.service.PerfilService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping ("/perfil")
//public class PerfilController {
//    @Autowired
//    private PerfilService perfilServicio;
//
//    @GetMapping("/buscar/perfil")
//    public List<Perfil> mostrarPerfil(){
//
//        return perfilServicio.mostrarPerfil();
//    }
//
//    @GetMapping ("/perfil/{id}")
//    public ResponseEntity<Perfil> buscarPerfil(@PathVariable("id") Long id){
//        if (!perfilServicio.existsByIdPerfil(id)){
//            return new ResponseEntity(new Mensaje("No existe el  empleado"), HttpStatus.NOT_FOUND);
//        }else {
//            Perfil perfil = perfilServicio.getPerfil(id).get();
//            return new ResponseEntity(perfil, HttpStatus.OK);
//        }
//
//    }
//
//    @PostMapping(path = "/insertarPerfilJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity <Boolean> insertarPerfil (@RequestBody Perfil perfil){
//
//        return new ResponseEntity<Boolean>(perfilServicio.insertarPerfilJPA(perfil), HttpStatus.OK)  ;
//    }
//    @PutMapping(path = "/actualizarTodoJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Boolean> actualizarTodoJPA (@RequestBody Perfil perfil){
//
//        return new ResponseEntity<Boolean> (perfilServicio.actualizarTodoJPA(perfil), HttpStatus.OK);
//
//    }
//
//    @DeleteMapping("/borrarPerfilJPA/{id}")
//    public void borrarPerfilJPA(@PathVariable("id") Long id) {
//        perfilServicio.deletePerfilById(id);
//    }
//}
