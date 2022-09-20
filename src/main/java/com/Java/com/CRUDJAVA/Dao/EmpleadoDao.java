package com.Java.com.CRUDJAVA.Dao;

import com.Java.com.CRUDJAVA.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoDao extends JpaRepository<Empleado,Long> {

}
