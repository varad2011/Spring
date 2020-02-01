package com.ciWithCollection;

import java.util.Iterator;
import java.util.List;

public class EmployeSetList {

	private String name;
	private String lastName;
	private List<String> list ;
	public EmployeSetList(String name, String lastName, List<String> list) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.list = list;
	}
	public void display() {
		System.out.println(name + lastName);
		Iterator<String> listOf = list.iterator();
		while(listOf.hasNext()) {
			System.out.println(listOf.next());
		}
	}
	
	
}
