package com.Java.com.CRUDJAVA.model;



import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@Table(name = "transaccion")
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String  concepto;
    private String  monto;
    //private Usuario usuario;
    //private Empresa empresa;
    private Date createdAt;
    private Date updateAt;
    /*
    @ManyToOne
    @JoinColumn(name = "idEmpleado")
    Empleado empleado;
    @ManyToOne
    @JoinColumn(name = "idEmpresaEmpleado")
    Empresa empresaEmpleado;
*/
}
