package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.model.Perfil;
import com.Java.com.CRUDJAVA.repository.IPerfil;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Service
public class PerfilService {
    private IPerfil iPerfil;

    @Autowired
    public void setRepositiry (IPerfil iPerfil){
        this.iPerfil = iPerfil;
    }

    ArrayList<Perfil> listaE;
    public PerfilService(ArrayList<Perfil> listaE) {

        this.listaE = listaE;
    }
    public List<Perfil> mostrarPerfil(){
        return iPerfil.findAll();

    }
    public boolean existsByIdPerfil(Long id){
        return iPerfil.existsById(id);
    }
    public Optional<Perfil> getPerfil(Long id){
        return  iPerfil.findById(id);
    }


    public Boolean insertarPerfilJPA(Perfil perfil){
        try {
            iPerfil.save(perfil);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public Boolean actualizarTodoJPA (Perfil perfil){

        try {
            iPerfil.save(perfil);
        }catch (Exception e){

            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public void deletePerfilById (Long id){

        iPerfil.deleteById(id);
    }
}
