package com.petShop.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="citas")

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cita")
    private Integer idAppointment;

    @Column(name="fecha_cita")
    private Date dateAppointment;

}


