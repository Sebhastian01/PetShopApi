package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table (name="propietarios")

public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_propietario")
    private Integer idOwner;

    @Column(name="nombre_propietario")
    private String nameOwner;

    @Column(name="apellidos_propietario")
    private String lastNameOwner;

    @Column(name="correo_propietario")
    private String emailOwner;

    @Column(name="telefono_propietario")
    private Integer phoneOwner;

    @Column(name="direccion_propietario")
    private String addressDirectionOwner;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;
}
