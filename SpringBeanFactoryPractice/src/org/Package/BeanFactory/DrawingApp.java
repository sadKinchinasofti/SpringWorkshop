package org.Package.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		Traingle traingle = (Traingle) context.getBean("traingle");
		traingle.draw();

	}

}
