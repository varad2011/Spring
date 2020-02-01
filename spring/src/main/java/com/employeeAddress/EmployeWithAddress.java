package com.employeeAddress;

public class EmployeWithAddress {

	private String name;
	private String lastName;
	private Address address;
	
	public EmployeWithAddress(String name, String lastName, Address addressBook) {
		this.name = name;
		this.lastName = lastName;
		this.address = addressBook;
	}
	public void display() {
		System.out.println("display address" + name +lastName + address.toString());
	}
}
