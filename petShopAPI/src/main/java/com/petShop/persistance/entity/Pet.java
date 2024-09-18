package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="mascotas")
@Data

public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_mascota")
    private Integer id;

    @Column(name="nombre_mascota")
    private String name;

    @Column(name="especie")
    private String species;

    @Column(name="edad_mascota")
    private Integer age;

    @Column(name="genero_mascota")
    private String gender;

    @ManyToOne
    @JoinColumn(name="id_dueño")
    private Owner owner;

}
