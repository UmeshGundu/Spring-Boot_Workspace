package in.ashokit.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Car;

public class Main {
     public static void main(String[] args) {
		
    	 ApplicationContext ctxt = new ClassPathXmlApplicationContext("beans.xml");
   	     Car carBean = ctxt.getBean(Car.class);
    	 carBean.drive();
	}
}
