package com.petShop.web.controller;

import com.petShop.domain.dto.EmployeeDTO;
import com.petShop.domain.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public Iterable<EmployeeDTO> getAll() {
        return employeeService.getAll();
    }

    @GetMapping("/getById/{id_empleado}")
    public Optional<EmployeeDTO> getOwnerById(@PathVariable("id_empleado") int id) { return employeeService.getOwnerById(id);
    }

    @PostMapping("/save")
    public EmployeeDTO save(@RequestBody EmployeeDTO ownerDTO) {
        return employeeService.save(ownerDTO);
    }

    @PutMapping("/update")
    public EmployeeDTO update(@RequestBody EmployeeDTO ownerDTO) {
        return employeeService.update(ownerDTO);
    }

    @DeleteMapping("/delete/{id_empleado}")
    public void delete(@PathVariable("id_empleado") int id) {
        employeeService.delete(id);
    }

    @GetMapping("/existsEmployee/{id_empleado}")
    public boolean existsEmployee(@PathVariable("id_empleado") int id) {
        return employeeService.existsEmployee(id);
    }

    @GetMapping("/countEmployees")
    public long countEmployees() {
        return employeeService.countAll();
    }
}
