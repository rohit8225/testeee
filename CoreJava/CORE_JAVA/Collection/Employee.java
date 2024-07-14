package com.Collection;

public class Employee {
	private int id;
	private String name;
	private int salary;
	

	public Employee(int i, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=name;
		this.salary=salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}



}
