package com.petShop.persistance.PetMapper;

import com.petShop.domain.PetDomain;
import com.petShop.persistance.entity.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {OwnerMapper.class})
public interface PetMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "species", target = "species"),
            @Mapping(source = "age", target = "age"),
            @Mapping(source = "gender", target = "gender"),
            @Mapping(source = "Owner", target = "Owner")
    })
    PetDomain toPet (Pet pet);
    List<PetDomain> toPet(List<Pet> pets);
}
