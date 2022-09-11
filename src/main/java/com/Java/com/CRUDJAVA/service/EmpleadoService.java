package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.repository.IEmpleado;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Data
@Service
public class EmpleadoService {
    private IEmpleado iEmpleado;

    @Autowired
    public void setRepositiry (IEmpleado  iEmpleado){
        this.iEmpleado = iEmpleado;
    }

    ArrayList<Empleado> listaE;
    public EmpleadoService(ArrayList<Empleado> listaE) {

        this.listaE = listaE;
    }
    public List<Empleado> mostrarEmpleado(){
        return iEmpleado.findAll();

    }
    public boolean existsByIdEmpleado(Long id){
        return iEmpleado.existsById(id);
    }
    public Optional<Empleado> getEmpleado(Long id){
        return  iEmpleado.findById(id);
    }


    public Boolean insertarPersonaJPA(Empleado empleado){
        try {
            iEmpleado.save(empleado);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public Boolean actualizarTodoJPA (Empleado empleado){

        try {
            iEmpleado.save(empleado);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public void deleteEmpleadoById (Long id){

        iEmpleado.deleteById(id);
    }
}
