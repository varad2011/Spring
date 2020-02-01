package com.employeeAddress;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeWithAddressMain {

	public static void main(String[] args) {
	Resource resource = new ClassPathResource("Application.xml");
	BeanFactory factory = new XmlBeanFactory(resource);
	EmployeWithAddress employeWithAddress = (EmployeWithAddress) factory.getBean("employeeAddress");
	employeWithAddress.display();
	}

}
