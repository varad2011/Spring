package com.ciWithCollection2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employe employe = (Employe) factory.getBean("employeWithCol");
		employe.display();
	}

}
