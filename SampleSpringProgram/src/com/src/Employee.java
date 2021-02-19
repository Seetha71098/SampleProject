package com.src;

public class Employee {

	private int employeeid;
	private String employeename;
	private String city;
	private double salary;
	private Project project;
	
	public Employee() {
		super();
	}
	
	public Employee(int employeeid, String employeename, String city, double salary, Project project) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.city = city;
		this.salary = salary;
		this.project = project;
	}
	
	public Employee(int employeeid, String employeename, String city, double salary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.city = city;
		this.salary = salary;
	}
	
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", city=" + city + ", salary="
				+ salary + ", project=" + project + "]";
	}
	
	
	
	
}
