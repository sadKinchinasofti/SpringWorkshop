package org.Kingsuk.Springmodule;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		BeanFactory bean1 = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		Traingle traingle = (Traingle) bean1.getBean("traingle");
		traingle.draw();

	}

}
