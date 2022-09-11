package com.Java.com.CRUDJAVA.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "rol")
public class Enum_RolName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String admin;
    private String operario;

    public Enum_RolName() {

    }
}
