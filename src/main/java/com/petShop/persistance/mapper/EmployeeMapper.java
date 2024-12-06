package com.petShop.persistance.mapper;
import com.petShop.domain.dto.EmployeeDTO;
import com.petShop.persistance.entity.Employee;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    @Mappings({
            @Mapping(source = "idEmployee", target = "id_empleado"),
            @Mapping(source = "nameEmployee", target = "nombre_empleado"),
            @Mapping(source = "position", target = "cargo"),
            @Mapping(source = "number", target = "numero")
    })
    EmployeeDTO toEmployeeDTO(Employee employee);

    List<EmployeeDTO> toEmployeeDTOs(List<Employee> employees);

    @InheritInverseConfiguration
    Employee toEntity(EmployeeDTO employeeDTO);
}
