package com.employee.rose.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String firstname;
private String lastname;
private String email;
private String deparmentCode;
private int Orgid;
public int getOrgid() {
	return Orgid;
}
public void setOrgid(int orgid) {
	Orgid = orgid;
}
public Employee(long id, String firstname, String lastname, String email, String deparmentCode) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.deparmentCode = deparmentCode;
}
public Employee(long id, String firstname, String lastname, String email, String deparmentCode, int orgid) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.deparmentCode = deparmentCode;
	Orgid = orgid;
}
public String getDeparmentCode() {
	return deparmentCode;
}
public void setDeparmentCode(String deparmentCode) {
	this.deparmentCode = deparmentCode;
}
public Employee() {
	super();
}
public Employee(long id, String firstname, String lastname, String email) {
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
