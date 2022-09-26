package com.Java.com.CRUDJAVA.Dao;

import com.Java.com.CRUDJAVA.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilDao extends JpaRepository<Perfil, Long> {

    Perfil findByUsername(String username);
}
