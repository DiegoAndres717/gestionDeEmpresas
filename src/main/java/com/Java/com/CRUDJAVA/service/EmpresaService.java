package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.Dao.EmpresaDao;
import com.Java.com.CRUDJAVA.Repository.IEmpresa;
import com.Java.com.CRUDJAVA.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpresaService implements IEmpresa {

    @Autowired
    EmpresaDao empresaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Empresa> listaEmpresas() {
        return empresaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Empresa empresa) {
        empresaDao.save(empresa);
    }

    @Override
    @Transactional
    public void eliminar(Empresa empresa) {
        empresaDao.delete(empresa);
    }

    @Override
    @Transactional(readOnly = true)
    public Empresa buscar(Empresa empresa) {
        return empresaDao.findById(empresa.getId()).orElse(null);
    }
}
