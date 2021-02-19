package com.src;

import java.util.List;

public class Customer {
	
private int cid;
private String cname;
private List<Address> address;



public Customer(int cid, String cname, List<Address> address) {
	
	this.cid = cid;
	this.cname = cname;
	this.address = address;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public List<Address> getAddress() {
	return address;
}
public void setAddress(List<Address> address) {
	this.address = address;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
}



}
