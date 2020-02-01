package com.employeeAddress;

public class Address {

	private String village;
	private String city;
	private String state;
	
	public Address(String village, String city, String state) {
		super();
		this.village = village;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return  village + ", city=" + city + ", state=" + state ;
	}
	
}

