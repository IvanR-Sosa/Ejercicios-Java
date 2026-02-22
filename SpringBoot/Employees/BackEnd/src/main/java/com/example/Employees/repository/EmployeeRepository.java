
package com.example.Employees.repository;

import com.example.Employees.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
      
    
}
