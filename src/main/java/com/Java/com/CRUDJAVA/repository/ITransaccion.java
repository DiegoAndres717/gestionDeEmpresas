package com.Java.com.CRUDJAVA.repository;

import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITransaccion extends JpaRepository<Transaccion,Long> {
}
