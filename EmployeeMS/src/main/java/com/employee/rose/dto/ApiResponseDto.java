package com.employee.rose.dto;

public class ApiResponseDto {
	private EmployeeDto employeedto;
	private Department department ;
	public EmployeeDto getEmployeedto() {
		return employeedto;
	}
	public void setEmployeedto(EmployeeDto employeedto) {
		this.employeedto = employeedto;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
