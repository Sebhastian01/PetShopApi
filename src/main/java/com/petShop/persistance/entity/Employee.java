package com.petShop.persistance.entity;

//import lombok.Data;
import jakarta.persistence.*;

//@Data
@Entity
@Table(name="empleados")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private Integer idEmployee;

    @Column(name="nombre_propietario")
    private String nameEmployee;

    @Column(name="apellidos_empleado")
    private String lastNameEmployee;

    @Column(name="correo_empleado")
    private String emailEmployee;

}
/*
crear entidad (clases)
citas
productos
proveedores
factura de servicio
historia medica
veteriano
los demas que considere...
 */