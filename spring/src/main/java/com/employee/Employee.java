package com.employee;

public class Employee {

	private String name;
	private String lastName;
	private int id;
	
	Employee (String name){
		this.name = name;
	}
	Employee(String name, String lastName){
		this.lastName = lastName;
		this.name = name;
	}
	Employee(){
		System.out.println("employee without parameter constructor");
	}
	public void display() {
		System.out.println("employee"  +name +lastName );
	}
}
