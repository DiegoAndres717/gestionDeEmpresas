package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.Repository.IEmpleado;
import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.Dao.EmpleadoDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Data
@Service
public class EmpleadoService implements IEmpleado {

    @Autowired
    private EmpleadoDao empleadoDao;
    @Override
    @Transactional(readOnly = true)
    public List<Empleado> listaPersonaas() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Empleado empleado) {
        empleadoDao.save(empleado);
    }

    @Override
    @Transactional
    public void eliminar(Empleado empleado) {
        empleadoDao.delete(empleado);
    }

    @Override
    @Transactional(readOnly = true)
    public Empleado buscar(Empleado empleado) {
        return empleadoDao.findById(empleado.getIdEmpleado()).orElse(null);
    }
}
