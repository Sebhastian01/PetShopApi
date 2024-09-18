package com.petShop.domain;

import lombok.Data;

@Data

public class PetDomain {
    private Integer idMascota;
    private String nameMascota;
    private String speciesMascota;
    private Integer ageMascota;
    private String genderMascota;
    private OwnerDomain OwnerDomainMascota;
}
