package com.Java.com.CRUDJAVA.model;


import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "empleado")
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPerfil")
    private Perfil perfil;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idEmpresa")
    private Empresa empresa;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createAt;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateAt;

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
