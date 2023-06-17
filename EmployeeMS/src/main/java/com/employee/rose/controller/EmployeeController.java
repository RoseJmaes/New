package com.employee.rose.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.rose.dto.ApiResponseDto;
import com.employee.rose.dto.EmployeeDto;
import com.employee.rose.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
class EmployeeController {
	@Autowired
	EmployeeService empService;

	
	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employeedto){
		
		EmployeeDto saveEmployee = empService.saveEmployee(employeedto);
		return new ResponseEntity<>(saveEmployee,HttpStatus.CREATED);
		
	}
	@GetMapping("{id}")
public ResponseEntity<ApiResponseDto> getEmployee(@PathVariable("id") Long Id){
		ApiResponseDto employeebyid = empService.getEmployeebyid(Id);
	return new ResponseEntity<>(employeebyid,HttpStatus.OK);
		
	}
}
