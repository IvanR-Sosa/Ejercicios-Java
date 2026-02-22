package com.example.Employees.service;

import com.example.Employees.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
       EmployeeDto createEmployee (EmployeeDto employeedto);
       EmployeeDto getEmployeeById(Long id);
       List<EmployeeDto>getAllEmployees();
       EmployeeDto updateEmployee(Long id,EmployeeDto employeeDto);
}
