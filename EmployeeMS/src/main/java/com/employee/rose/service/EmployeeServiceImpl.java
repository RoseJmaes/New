package com.employee.rose.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.rose.dto.ApiResponseDto;
import com.employee.rose.dto.Department;
import com.employee.rose.dto.EmployeeDto;
import com.employee.rose.entity.Employee;
import com.employee.rose.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepository emprepo;
	@Autowired
	RestTemplate resttemplate;

	public EmployeeServiceImpl(EmployeeRepository emprepo) {
		super();
		this.emprepo = emprepo;
	}

	@Override
	public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
		
		Employee emp= new Employee( employeeDto.getId(),
				                    employeeDto.getFirstname(),
				                    employeeDto.getLastname(),
				                    employeeDto.getEmail(),
				                    employeeDto.getDepartmentCode());
		Employee saveEmployee = emprepo.save(emp);
		EmployeeDto empDto=new EmployeeDto(saveEmployee.getId(),
				                             saveEmployee.getFirstname(),
				                             saveEmployee.getLastname(),
				                             saveEmployee.getEmail(),saveEmployee.getDeparmentCode());
		return  empDto ;
	}

	@Override
	public ApiResponseDto getEmployeebyid(Long Id) {
		
		
		Employee employee = emprepo.findById(Id).get();
		Department forObject = resttemplate.getForObject("http://localhost:8080/api/departments"+employee.
				getDeparmentCode(),Department.class);
		
		//(url:"http://localhost:8080/api/departments"+employee.getDeparmentCode() ,Department.class);
		EmployeeDto empDto=new EmployeeDto( employee.getId(),employee.getFirstname(),employee.getLastname(),employee.getEmail(),employee.getDeparmentCode());
		
		
 
//getForEntity("http://localhost:8080/api/departments"+employee.
		//getDeparmentCode(),Department.class);


ApiResponseDto apiresponse=new ApiResponseDto();
apiresponse.setDepartment(forObject);
apiresponse.setEmployeedto(empDto);

		return apiresponse;
	}
	public Employee getEmpdetails(int Orgid) {
		Employee emp = emprepo.findByOrgid();
		
		String url="localhost:8080/api/employee";
		Employee forObject = resttemplate.getForObject(url+emp.getId(),Employee.class );
		
		return forObject;
}}
