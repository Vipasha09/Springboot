package com.employee.first.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employee.first.app.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
