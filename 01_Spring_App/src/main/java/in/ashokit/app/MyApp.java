package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.DieselEngine;

public class MyApp {
	public static void main(String[] args) {
		
        System.out.println("running ");
      
		//Creating/start the IOC Container by the below class name.
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");

		//To get the objects from the IOC container below is the method used.
		DieselEngine de = ctxt.getBean(DieselEngine.class);
		de.start();
		
	}

}
