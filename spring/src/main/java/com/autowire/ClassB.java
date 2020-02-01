package com.autowire;

public class ClassB {

	 private ClassA classA1;
	 private ClassA classA;
	
	ClassB(){
		System.out.println("classB");
	}
	
	public ClassA getClassA() {
		return classA1;
	}
	public void setClassA(ClassA classA) {
		this.classA1 = classA;
		
	}
	public ClassA getClassA1() {
		return classA;
	}
	public void setClassA1(ClassA classA1) {
		this.classA = classA1;
	}
	
	public void display() {
		System.out.println("classB");
	}
	
	public void displayAll() {
		display();
		classA1.display();
		//classA.display();
	}
}
