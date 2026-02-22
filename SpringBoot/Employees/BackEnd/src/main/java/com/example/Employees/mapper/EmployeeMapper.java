package com.example.Employees.mapper;

import com.example.Employees.dto.EmployeeDto;
import com.example.Employees.model.Employee;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {

    public static Employee mapEmployee(EmployeeDto employeeDto){
       
        Employee employee = new Employee(employeeDto.getId(),
                                                  employeeDto.getFirstName(),
                                                  employeeDto.getLastName(),
                                                      employeeDto.getEmail()
        );
        
        return employee;
    }
    
    public static EmployeeDto mapEmployeeDto (Employee employee){
        
        EmployeeDto employeeDto = new EmployeeDto(employee.getId(), 
                                                                employee.getFirstName(),    
                                                                employee.getLastName(), 
                                                                    employee.getEmail()
        );
        
        return employeeDto;
}
    public static List<Employee> mapEmployeeList (List<EmployeeDto> employeeDtos){
        return employeeDtos.stream().map(EmployeeMapper::mapEmployee).collect(Collectors.toList());
    }
    public static List<EmployeeDto>mapEmployeeDtosList(List<Employee> employees){
        return employees.stream().map(EmployeeMapper::mapEmployeeDto).collect(Collectors.toList());
    }
    
}
