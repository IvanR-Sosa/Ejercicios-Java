package com.example.Employees.service.impl;

import com.example.Employees.dto.EmployeeDto;
import com.example.Employees.model.Employee;
import com.example.Employees.repository.EmployeeRepository;
import com.example.Employees.service.EmployeeService;
import com.example.Employees.mapper.EmployeeMapper;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class EmployeeserviceImpl implements EmployeeService{
    
    private EmployeeRepository employeeRepository;

    public EmployeeserviceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeedto) {
        Employee employee = EmployeeMapper.mapEmployee(employeedto);
        Employee saveEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapEmployeeDto(saveEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Trabajador no encontrado con id " + id));
        return EmployeeMapper.mapEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return EmployeeMapper.mapEmployeeDtosList(employees);

    }

    @Override
    public EmployeeDto updateEmployee(Long id,EmployeeDto employeeDto) {
        //Evitamos el posible caso de un id enviado en el cuerpo de la peticion y que este no coincida con el de la URL
        if (employeeDto.getId() != null && !employeeDto.getId().equals(id)) {
        throw new IllegalArgumentException("El ID en el cuerpo no coincide con el ID en la URL");
    }
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(()->new RuntimeException("ID No Encontrado" + id));
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEmail(employeeDto.getEmail());
        Employee updateEmployee = employeeRepository.save(employee);
        
        return EmployeeMapper.mapEmployeeDto(updateEmployee);
        
    }
    
    
}
