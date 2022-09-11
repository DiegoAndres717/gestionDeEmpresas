package com.Java.com.CRUDJAVA.model;

import com.Java.com.CRUDJAVA.service.EmpleadoService;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;


@Data
@AllArgsConstructor
@Entity
@Table(name = "Empresa")
public class Empresa {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;
        private String  nombre;
        private String  documento;
        private String  telefono;
        private String  direccion;

        //private Usuario[] usuarios;
        //private Transaccion[] transaccion;
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
