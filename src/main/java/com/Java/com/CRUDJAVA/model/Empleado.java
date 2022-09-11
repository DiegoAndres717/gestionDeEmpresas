package com.Java.com.CRUDJAVA.model;


import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    //private Perfil perfil;
    //private Enum_RolName role;
    @ManyToOne
    private Empresa empresa;
    //private Transaccion[] transaccion;
    private Date updateAt;
    private Date createdAt;

    public Empleado( ) {

    }


/*
    @OneToOne
    @JoinColumn(name = "idPerfil")
    Perfil perfil ;
    Enum_rol rol;
    @OneToOne
    @JoinColumn(name = "idEmpresa")
    Empresa empresaEmpleado;

*/



}
