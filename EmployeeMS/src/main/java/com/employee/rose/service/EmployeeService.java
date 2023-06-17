package com.employee.rose.service;

import com.employee.rose.dto.ApiResponseDto;
import com.employee.rose.dto.EmployeeDto;
import com.employee.rose.entity.Employee;

public interface EmployeeService {
	
	
	EmployeeDto saveEmployee(EmployeeDto employeeDto);
	ApiResponseDto getEmployeebyid(Long id);

}
