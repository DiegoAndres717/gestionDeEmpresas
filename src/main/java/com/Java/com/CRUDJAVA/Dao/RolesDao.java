package com.Java.com.CRUDJAVA.Dao;

import com.Java.com.CRUDJAVA.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesDao extends JpaRepository<Rol, Long> {
}
