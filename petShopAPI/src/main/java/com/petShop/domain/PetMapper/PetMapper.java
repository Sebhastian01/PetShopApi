package com.petShop.domain.PetMapper;

import com.petShop.domain.PetDomain;
import com.petShop.persistance.entity.Pet;
import com.petShop.persistance.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OwnerMapper.class})
public interface PetMapper {
    @Mappings({
            @Mapping(source = "idMascota", target = "id"),
            @Mapping(source = "nameMascota", target = "name"),
            @Mapping(source = "speciesMascota", target = "species"),
            @Mapping(source = "ageMascota", target = "age"),
            @Mapping(source = "genderMascota", target = "gender"),
            @Mapping(source = "OwnerDomainMascota", target = "Owner")
    })
    PetDomain toPet (Pet pet);
    List<PetDomain> toPet(List<Pet> pets);
}
