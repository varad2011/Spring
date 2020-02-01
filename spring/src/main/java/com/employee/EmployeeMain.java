package com.employee;

import java.io.ObjectInputStream.GetField;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import student.Students;

public class EmployeeMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee =  (Employee) factory.getBean("nameLastName");
		employee.display();
		
	}

}
