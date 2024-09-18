package com.petShop.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OwnerDomain {

    private Integer idDuenio;

    private String nameDuenio;

    private String lastNameDuenio;

    private String emailDuenio;

    private Integer genderMascota;

    private String OwnerDomainMascota;
}
