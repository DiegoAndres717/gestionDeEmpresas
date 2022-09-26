package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.Dao.PerfilDao;
import com.Java.com.CRUDJAVA.Repository.IPerfil;
import com.Java.com.CRUDJAVA.model.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServicePerfil implements IPerfil {

    @Autowired
    private PerfilDao perfilDao;

    @Override
    @Transactional(readOnly = true)
    public List<Perfil> listaPersonas() {
        return (List<Perfil>) perfilDao.findAll();
    }

    @Override
    public void guardarP(Perfil perfil) {
        perfilDao.save(perfil);
    }

    @Override
    public void eliminarP(Perfil perfil) {
        perfilDao.delete(perfil);
    }

    @Override
    public Perfil buscarP(Perfil perfil) {
        return perfilDao.findById(perfil.getId()).orElse(null);
    }
}
