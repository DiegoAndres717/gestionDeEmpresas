package com.Java.com.CRUDJAVA.Dao;

import com.Java.com.CRUDJAVA.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaDao extends JpaRepository<Empresa,Long> {


}
