package com.Java.com.CRUDJAVA.Repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Perfil;

import java.util.List;

public interface IPerfil {
    public List<Perfil> listaPersonas();

    public void guardarP(Perfil perfil);

    public void eliminarP(Perfil perfil);

    public Perfil buscarP(Perfil perfil);
}
