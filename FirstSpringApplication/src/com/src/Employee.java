package com.src;

public class Employee {

	private int eid;
	private String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
}

class PermanantEmployee{
	
	private double salary;
	private int workingdays;
	private Employee emp;
	public PermanantEmployee(double salary, int workingdays) {
		super();
		this.salary = salary;
		this.workingdays = workingdays;
	}
	public PermanantEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getWorkingdays() {
		return workingdays;
	}
	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	@Override
	public String toString() {
		return "PermanantEmployee [salary=" + salary + ", workingdays=" + workingdays + ", emp=" + emp + "]";
	}
	
	
}
