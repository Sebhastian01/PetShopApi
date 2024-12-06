package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table (name = "propietario")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_propietario")
    private Integer idOwner;

    @Column(name = "nombre_propietario")
    private String nameOwner;

    @Column(name = "apellidos_propietario")
    private String lastNameOwner;

    @Column(name = "correo_propietario")
    private String email;

    @Column(name = "telefono_propietario")
    private Integer number;

    @Column(name = "direccion_propietario")
    private String address;

//    @OneToMany(mappedBy = "owner")
//    private List<Pet> pets;


    public Integer getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
    }

}
