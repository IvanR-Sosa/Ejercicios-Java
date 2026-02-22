package com.example.Employees.controller;

import com.example.Employees.dto.EmployeeDto;
import com.example.Employees.service.EmployeeService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
 
    // Add Employee API REST
    @PostMapping
    public ResponseEntity <EmployeeDto> addEmployye (@RequestBody EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeService.createEmployee(employeeDto),HttpStatus.CREATED);
    }
    //Get Employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getById (@PathVariable Long id){
        EmployeeDto dto = employeeService.getEmployeeById(id);
        return  ResponseEntity.ok(dto);
    }
    // get ALL employees
    @GetMapping("/all")
    public List<EmployeeDto> gatAll(){
        return employeeService.getAllEmployees();
    }
    //Update
    @PutMapping("/update/{id}")
    public ResponseEntity<EmployeeDto> update(@PathVariable Long id, @RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.updateEmployee(id, employeeDto));
    }
    
}