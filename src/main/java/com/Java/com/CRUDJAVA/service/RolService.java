package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.Dao.PerfilDao;
import com.Java.com.CRUDJAVA.Dao.RolesDao;
import com.Java.com.CRUDJAVA.Repository.IRoles;
import com.Java.com.CRUDJAVA.model.Perfil;
import com.Java.com.CRUDJAVA.model.Rol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolService implements IRoles {

    @Autowired
    private RolesDao rolesDao;

    @Override
    public void guardarR(Rol rol) {
        rolesDao.save(rol);
    }

    @Override
    public void eliminarP(Rol rol) {
        rolesDao.delete(rol);
    }
}
