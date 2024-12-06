package com.petShop.web.controller;

import com.petShop.domain.dto.AppointmentDTO;
import com.petShop.domain.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping("/getAll")
    public Iterable<AppointmentDTO> getAll() {
        return appointmentService.getAll();
    }

    @GetMapping("/getById/{id_cita}")
    public Optional<AppointmentDTO> getAppointmentById(@PathVariable("id_cita") int id) { return appointmentService.getAppointmentById(id);}

    @PostMapping("/save")
    public AppointmentDTO save(@RequestBody AppointmentDTO appointmentDTO) {return appointmentService.save(appointmentDTO);}

    @PutMapping("/update")
    public AppointmentDTO update(@RequestBody AppointmentDTO appointmentDTO) {return appointmentService.update(appointmentDTO);}

    @DeleteMapping("/delete/{id_cita}")
    public void delete(@PathVariable("id_cita") int id) {
        appointmentService.delete(id);
    }

    @GetMapping("/existsAppointment/{id_cita}")
    public boolean existsAppointment(@PathVariable("id_cita") int id) {
        return appointmentService.existsAppointment(id);
    }

    @GetMapping("/countAppointments")
    public long countAppointments() {
        return appointmentService.countAll();
    }
}