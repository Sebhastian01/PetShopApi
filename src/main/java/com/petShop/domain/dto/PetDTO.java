package com.petShop.domain.dto;

import lombok.Data;

@Data

public class PetDTO {
    private Integer id;
    private String name;
    private String species;
    private Integer age;
    private String gender;
    private Integer idOwner;
}
