package student;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Application.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Students student=(Students)factory.getBean("display");  
		student.display();  
	  
	}
	

}
