package com.siWithConst;

import java.util.List;

public class Employe {
	
	private String name;
	private String lastName;
	private List<Address> address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", lastName=" + lastName + ", address=" + address + "]";
	}
	public void display() {
		System.out.println(name + lastName);
		for (Address address2 : address) {
			System.out.println(address2);
		}
	}
	
}