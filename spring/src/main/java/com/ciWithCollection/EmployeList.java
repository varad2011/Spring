package com.ciWithCollection;

import java.util.Iterator;
import java.util.Set;

public class EmployeList {
	private String name ;
	private String lastName;
	private Set<String> list;
	
	EmployeList (){
		
	}
	EmployeList(String name, String lastName, Set<String> list){
		this.name = name;
		this.lastName = lastName;
		this.list = list;
	}
	public void display() {
		System.out.println(name +" "+ lastName );
		Iterator<String> listOf = list.iterator();
		while(listOf.hasNext()) {
			System.out.println(listOf.next());
		}
	}
}
