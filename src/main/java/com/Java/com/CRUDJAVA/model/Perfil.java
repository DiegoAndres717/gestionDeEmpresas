package com.Java.com.CRUDJAVA.model;



import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;


@Data
@Entity
@AllArgsConstructor
@Table(name = "Perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String imagen;
    private String telefono;
    //private Empleado usuario;
    private Date creantedAt;
    private Date updateAt;
}
