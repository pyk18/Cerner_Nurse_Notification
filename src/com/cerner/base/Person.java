package com.cerner.base;

public class Person extends Address {

private String name;
private String lName;
private String contactNumber;
private Address address;
private float height;
private float weight;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getlName() {
	return lName;
}
public void setlName(String lName) {
	this.lName = lName;
}
public String getContactNumber() {
	return contactNumber;
}
public void setContactNumber(String contactNumber) {
	this.contactNumber = contactNumber;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public float getHeight() {
	return height;
}
public void setHeight(float height) {
	this.height = height;
}




}
