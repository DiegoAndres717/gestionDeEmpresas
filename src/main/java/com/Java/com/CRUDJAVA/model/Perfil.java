package com.Java.com.CRUDJAVA.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "perfil")
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String imagen;
    private String telefono;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date creantedAt;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateAt;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;
}
