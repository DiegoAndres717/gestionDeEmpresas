package com.Java.com.CRUDJAVA.Repository;

import com.Java.com.CRUDJAVA.model.Empleado;

import java.util.List;

public interface IEmpleado {

    public List<Empleado> listaPersonaas();

    public void guardar(Empleado empleado);

    public void eliminar(Empleado empleado);

    public Empleado buscar(Empleado empleado);
}
