package com.practice.IwPractice;

public class Employee {

	private String empName;
	private Integer empId;
	private String Phone;
	private String salary;

	public Employee(String name, Integer id, String phone, String salary) {
		this.empId = id;
		this.empName = name;
		this.salary = salary;
		this.Phone = phone;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
