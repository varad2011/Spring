package com.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class autowireMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		ClassB  classB = (ClassB) factory.getBean("classB");
		classB.displayAll();

	}

}
