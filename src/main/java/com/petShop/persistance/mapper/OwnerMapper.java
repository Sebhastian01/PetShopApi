package com.petShop.persistance.mapper;


import com.petShop.domain.dto.OwnerDTO;

import com.petShop.persistance.entity.Owner;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {
    @Mappings({
            @Mapping(source = "idOwner", target = "id_propietario"),
            @Mapping(source = "nameOwner", target = "nombre_propietario"),
            @Mapping(source = "lastNameOwner", target = "apellidos_propietario"),
            @Mapping(source = "email", target = "correo_propietario"),
            @Mapping(source = "number", target = "telefono_propietario"),
            @Mapping(source = "address", target = "direccion_propietario")
    })
    OwnerDTO toOwnerDTO(Owner owner);

    @Mappings({
            @Mapping(source = "id_propietario", target = "idOwner"),
            @Mapping(source = "nombre_propietario", target = "nameOwner"),
            @Mapping(source = "apellidos_propietario", target = "lastNameOwner"),
            @Mapping(source = "correo_propietario", target = "email"),
            @Mapping(source = "telefono_propietario", target = "number"),
            @Mapping(source = "direccion_propietario", target = "address")
    })
    Owner toEntity(OwnerDTO ownerDTO);

    List<OwnerDTO> toOwnerDTO(List<Owner> owners);

//    @InheritInverseConfiguration
//    Owner toOwner(OwnerDTO ownerDTO);
}