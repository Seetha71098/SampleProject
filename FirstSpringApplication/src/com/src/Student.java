package com.src;

public class Student {

	private int studentid;
	private String studentname;
	private long studentmobno;
	private Address address;
	
	
	public Student() {

	}

	public Student(int studentid, String studentname, long studentmobno) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmobno = studentmobno;
	}
	
	
	public Student(int studentid, String studentname, long studentmobno, Address address) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentmobno = studentmobno;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public long getStudentmobno() {
		return studentmobno;
	}
	public void setStudentmobno(long studentmobno) {
		this.studentmobno = studentmobno;
	}
	
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentmobno=" + studentmobno
				+ ", address=" + address + "]";
	}
	
	
	
	
	
}
