package in.ashokit.MyApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class MyApp {
	public static void main(String[] args) {
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
		
		Car bean = ctxt.getBean(Car.class);
		bean.drive();
	}

}
