package com.siWithConst;

public class Address {
	private String village;
	private String city;
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", city=" + city + "]";
	}
	
}
