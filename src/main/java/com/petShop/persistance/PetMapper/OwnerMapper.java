package com.petShop.persistance.PetMapper;

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
            @Mapping(source = "idOwner", target = "idOwner"),
            @Mapping(source = "nameOwner", target = "nameOwner"),
            @Mapping(source = "lastNameOwner", target = "lastNameOwner"),
            @Mapping(source = "emailOwner", target = "emailOwner"),
            @Mapping(source = "phoneOwner", target = "phoneOwner"),
            @Mapping(source = "addressDirectionOwner", target = "addressDirectionOwner")
    })
    OwnerDomain toOwner (Owner owner);
    List<OwnerDomain> toPet(List<Owner> owners);
}
