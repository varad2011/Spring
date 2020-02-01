package com.ciWithCollection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeSetMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		EmployeSetList employeList = (EmployeSetList)factory.getBean("employeSet");
		employeList.display();

	}

}
