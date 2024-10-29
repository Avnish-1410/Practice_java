package com.company.hr;

public class Employee {
	private int empID;
	private String name;
	private double salary;
	public Employee(int empID, String name, double salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	public void displayEmployeeDetails() {
		System.out.println(empID+" "+ name +" "+salary);
	}
}