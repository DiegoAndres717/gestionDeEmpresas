package com.Java.com.CRUDJAVA.Repository;

import com.Java.com.CRUDJAVA.model.Transaccion;

import java.util.List;

public interface ITransaccion {

    public List<Transaccion> listaTran();

    public void guardarTran(Transaccion transaccion);

    public void eliminarTran(Transaccion transaccion);

    public Transaccion buscarTran(Transaccion transaccion);
}
