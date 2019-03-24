package org.Package.SpringLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		context.registerShutdownHook();
        Traingle traingle = (Traingle)context.getBean("traingle");
        traingle.draw();
	}

}
