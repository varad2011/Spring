package com.ciWithCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeListMain {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		EmployeList list = (EmployeList) factory.getBean("employeList");
		list.display();
		
		
	}

}
