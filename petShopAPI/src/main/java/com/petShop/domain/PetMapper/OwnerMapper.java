package com.petShop.domain.PetMapper;

import com.petShop.domain.OwnerDomain;
import com.petShop.domain.PetDomain;
import com.petShop.persistance.entity.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OwnerMapper {
    @Mappings({
            @Mapping(source = "idDuenio", target = "idOwner"),
            @Mapping(source = "nameDuenio", target = "nameOwner"),
            @Mapping(source = "lastNameDuenio", target = "lastNameOwner"),
            @Mapping(source = "emailDuenio", target = "emailOwner"),
            @Mapping(source = "genderMascota", target = "phoneOwner"),
            @Mapping(source = "OwnerDomainMascota", target = "addressDirectionOwner")
    })
    OwnerDomain toOwner (Owner owner);
    List<OwnerDomain> toPet(List<Owner> owners);
}
