package com.petShop.domain.dto;

import lombok.Data;

@Data
public class EmployeeDTO {
    private Integer id_empleado;
    private String nombre_empleado;
    private String cargo;
    private String numero;
}