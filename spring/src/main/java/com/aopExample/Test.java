package com.aopExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("Application.xml");
		  
		  Opeartion op = (Opeartion) context.getBean("opBean"); op.msg();
		 
	}

}
