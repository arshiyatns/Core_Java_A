package com.tns.day5;

public class Employee extends Person
{
	private int empId;
	private float salary;
	private String dept;

	public Employee(String name, String city,int empId,float salary,String dept) {
		super(name, city);
		this.empId=empId;
		this.dept= dept;
		this.salary= salary;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", getName()=" + getName()
				+ ", getCity()=" + getCity() + "]";
	}

	

}
