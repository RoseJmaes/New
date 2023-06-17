package com.employee.rose.dto;

public class EmployeeDto {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String departmentCode;
	private int Orgid;
	
	public EmployeeDto(long id, String firstname, String lastname, String email, String departmentCode, int orgid) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.departmentCode = departmentCode;
		Orgid = orgid;
	}
	public int getOrgid() {
		return Orgid;
	}
	public void setOrgid(int orgid) {
		Orgid = orgid;
	}
	public EmployeeDto(long id, String firstname, String lastname, String email, String departmentCode) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.departmentCode = departmentCode;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	public EmployeeDto() {
		super();
	}
	public EmployeeDto(long id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
