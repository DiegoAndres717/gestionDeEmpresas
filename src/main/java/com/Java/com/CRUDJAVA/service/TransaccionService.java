package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.model.Transaccion;
import com.Java.com.CRUDJAVA.repository.ITransaccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransaccionService {

    private ITransaccion iTransaccion;

    @Autowired
    public void setRepositiry (ITransaccion  iTransaccion){
        this.iTransaccion = iTransaccion;
    }

    ArrayList<Transaccion> listaE;
    public TransaccionService(ArrayList<Transaccion> listaE) {

        this.listaE = listaE;
    }
    public List<Transaccion> mostrarTransaccion(){
        return iTransaccion.findAll();

    }
    public boolean existsByIdTransaccion(Long id){
        return iTransaccion.existsById(id);
    }
    public Optional<Transaccion> getTransaccion(Long id){
        return  iTransaccion.findById(id);
    }


    public Boolean insertarTransaccionJPA(Transaccion transaccion){
        try {
            iTransaccion.save(transaccion);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public Boolean actualizarTodoJPA (Transaccion transaccion){

        try {
            iTransaccion.save(transaccion);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public void deleteTransaccionById (Long id){

        iTransaccion.deleteById(id);
    }
}
