package com.Java.com.CRUDJAVA.service;

import com.Java.com.CRUDJAVA.Repository.ITransaccion;
import com.Java.com.CRUDJAVA.model.Empleado;
import com.Java.com.CRUDJAVA.model.Transaccion;
import com.Java.com.CRUDJAVA.Dao.TransaccionDao;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Data
public class TransaccionService implements ITransaccion {

    @Autowired
    private TransaccionDao transaccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Transaccion> listaTran() {
        return transaccionDao.findAll();
    }

    @Override
    @Transactional
    public void guardarTran(Transaccion transaccion) {
        transaccionDao.save(transaccion);
    }

    @Override
    @Transactional
    public void eliminarTran(Transaccion transaccion) {
        transaccionDao.delete(transaccion);
    }

    @Override
    @Transactional(readOnly = true)
    public Transaccion buscarTran(Transaccion transaccion) {
        return transaccionDao.findById(transaccion.getId()).orElse(null);
    }
}
