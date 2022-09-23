package com.Java.com.CRUDJAVA.Repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Empresa;

import java.util.List;

public interface IEmpresa {

    public List<Empresa> listaEmpresas();

    public void guardar(Empresa empresa);

    public void eliminar(Empresa empresa);

    public Empresa buscar(Empresa empresa);

}
