package com.Java.com.CRUDJAVA.Dao;

import com.Java.com.CRUDJAVA.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionDao extends JpaRepository<Transaccion,Long> {
}
