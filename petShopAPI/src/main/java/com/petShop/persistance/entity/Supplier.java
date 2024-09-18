package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="proveedores")

public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_proveedor")
    private Integer idSupplier;

    @Column(name="nombre_proveedor")
    private String nameSupplier;

    @Column(name="apellidos_proveedor")
    private String lastNameSupplier;

    @Column(name="correo_proveedor")
    private String emailSupplier;
}
