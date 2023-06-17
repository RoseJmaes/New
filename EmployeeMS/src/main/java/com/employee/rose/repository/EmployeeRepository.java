package com.employee.rose.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.rose.dto.EmployeeDto;
import com.employee.rose.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

Employee findByOrgid();
}
