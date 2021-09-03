/**
 * @author Pallavi Dhamdhere (51958349)
 */

package com.model;

public class Employee {

	private int empID;
	private String name;
	private float salary;

	public Employee() {
		super();

	}

	public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
