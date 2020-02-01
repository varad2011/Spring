package com.siWith;

public class Employe {
	
	private String name;
	private String lastName;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employe [name=" + name + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	public void display() {
		System.out.println(name + lastName +id);
	}
	
}
