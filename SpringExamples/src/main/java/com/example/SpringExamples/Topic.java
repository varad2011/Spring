package com.example.SpringExamples;

public class Topic {
	
	private String name ;
	private String lastName;
	private String number;
	
	public Topic(String name, String lastName, String number) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.number = number;
	}
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Topic [name=" + name + ", lastName=" + lastName + ", number=" + number + "]";
	}
}
