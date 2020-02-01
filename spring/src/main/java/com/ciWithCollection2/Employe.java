package com.ciWithCollection2;

import java.util.Iterator;
import java.util.List;

public class Employe {
 private String name;
 private List<Address> address;
 
public Employe(String name, List<Address> address) {
	super();
	this.name = name;
	this.address = address;
	
} 
 	public void display() {
 		System.out.println(name );
 		Iterator<Address> addre = address.iterator();
 		while(addre.hasNext()) {
 			System.out.println(addre.next());
 		}
 	}
}
