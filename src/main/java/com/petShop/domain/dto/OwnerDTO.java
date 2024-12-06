package com.petShop.domain.dto;

import com.petShop.persistance.entity.Pet;
import lombok.Data;

import java.util.List;
@Data
public class OwnerDTO {
    private Integer id_propietario;
    private String nombre_propietario;
    private String apellidos_propietario;
    private String correo_propietario;
    private Integer telefono_propietario;
    private String direccion_propietario;
}