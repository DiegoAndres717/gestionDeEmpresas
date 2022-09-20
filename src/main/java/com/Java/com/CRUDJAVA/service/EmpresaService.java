package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.model.Empresa;
import com.Java.com.CRUDJAVA.Dao.IEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmpresaService {

    private IEmpresa iEmpresa;

    @Autowired
    public void setRepositiry (IEmpresa  iEmpresa){
        this.iEmpresa = iEmpresa;
    }

    ArrayList<Empresa> listaE;
    public EmpresaService(ArrayList<Empresa> listaE) {

        this.listaE = listaE;
    }
    public List<Empresa> mostrarEmpresa(){
        return iEmpresa.findAll();

    }
    public boolean existsByIdEmpresa(Long id){
        return iEmpresa.existsById(id);
    }
    public Optional<Empresa> getEmpresa(Long id){
        return  iEmpresa.findById(id);
    }


    public Boolean insertarEmpresaJPA(Empresa empresa){
        try {
            iEmpresa.save(empresa);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public Boolean actualizarTodoJPA (Empresa empresa){

        try {
            iEmpresa.save(empresa);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public void deleteEmpresaById (Long id){

        iEmpresa.deleteById(id);
    }
}
