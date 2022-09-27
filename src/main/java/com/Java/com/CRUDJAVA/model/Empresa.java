package com.Java.com.CRUDJAVA.model;

import com.Java.com.CRUDJAVA.service.EmpleadoService;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Data
@AllArgsConstructor
@Entity
@Table(name = "Empresa")
public class Empresa {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String  nombre;
        private String  documento;
        private String  telefono;
        private String  direccion;
        private Date createdAt;
        private Date updateAt;

        public Empresa() {
        }

        /*
        @OneToMany
        @JoinColumn(name = "idEmpleado")
        Empleado empleado;

        @OneToMany
        @JoinColumn(name = "idTransaccion")
        Transacion transaccion;

        public Transacion getTransaccion() {
                return transaccion;
        }

        public void setTransaccion(Transacion transaccion) {
                this.transaccion = transaccion;
        }


        public Empleado getEmpleado() {
                return empleado;
        }

        public void setEmpleado(Empleado empleado) {
                this.empleado = empleado;
        }
*/
}
