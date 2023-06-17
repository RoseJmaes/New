package com.employee.rose.dto;




	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;


		@Getter
		@Setter
		@NoArgsConstructor
		@AllArgsConstructor
	
		public class Department {
			private long id;
			private String departmentName;
			private String departmentDescrription;
			private String departmentCode;
			public long getId() {
				return id;
			}
			public void setId(long id) {
				this.id = id;
			}
			public String getDepartmentName() {
				return departmentName;
			}
			public void setDepartmentName(String departmentName) {
				this.departmentName = departmentName;
			}
			public String getDepartmentDescrription() {
				return departmentDescrription;
			}
			public void setDepartmentDescrription(String departmentDescrription) {
				this.departmentDescrription = departmentDescrription;
			}
			public String getDepartmentCode() {
				return departmentCode;
			}
			public void setDepartmentCode(String departmentCode) {
				this.departmentCode = departmentCode;
			}
			public Department(long id, String departmentName, String departmentDescrription, String departmentCode) {
				super();
				this.id = id;
				this.departmentName = departmentName;
				this.departmentDescrription = departmentDescrription;
				this.departmentCode = departmentCode;
			}
			
		
		}


