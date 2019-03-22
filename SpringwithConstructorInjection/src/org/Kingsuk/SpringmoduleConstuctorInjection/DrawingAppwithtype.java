package org.Kingsuk.SpringmoduleConstuctorInjection;
import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingAppwithtype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
     Traingle traingle= (Traingle) context.getBean("traingle");
     traingle.draw();
	}

}
