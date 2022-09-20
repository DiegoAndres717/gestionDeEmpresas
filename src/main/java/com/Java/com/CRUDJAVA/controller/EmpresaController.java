//package com.Java.com.CRUDJAVA.controller;
//
//
//import com.Java.com.CRUDJAVA.model.Empleado;
//import com.Java.com.CRUDJAVA.model.Empresa;
//import com.Java.com.CRUDJAVA.model.Mensaje;
//import com.Java.com.CRUDJAVA.service.EmpresaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//@RestController
//@RequestMapping("/Api")
//public class EmpresaController {
//
//    @Autowired
//    private EmpresaService empresaService;
//
//    @GetMapping ("/buscar/empresas")
//    public List<Empresa> mostrarEmpresas(){
//
//        return empresaService.mostrarEmpresa();
//    }
//
//    @GetMapping ("/empresa/{id}")
//    public ResponseEntity<Empleado> buscarEmpleado(@PathVariable("id") Long id){
//        if (!empresaService.existsByIdEmpresa(id)){
//            return new ResponseEntity(new Mensaje("No existe el  empresa"), HttpStatus.NOT_FOUND);
//        }else {
//            Empresa empresa = empresaService.getEmpresa(id).get();
//            return new ResponseEntity(empresa, HttpStatus.OK);
//        }
//
//    }
//
//    @PostMapping (path = "/insertarEmpleadoJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity <Boolean> insertarEmpresa (@RequestBody Empresa empresa){
//
//        return new ResponseEntity<Boolean>(empresaService.insertarEmpresaJPA(empresa), HttpStatus.OK)  ;
//    }
//    @PutMapping (path = "/actualizarTodoJPA", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Boolean> actualizarTodoJPA (@RequestBody Empresa empresa){
//
//        return new ResponseEntity<Boolean> (empresaService.actualizarTodoJPA(empresa), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/borrarEmpleadoJPA/{id}")
//    public void borrarEmpresaJPA(@PathVariable("id") Long id) {
//        empresaService.deleteEmpresaById(id);
//    }
//
//}
