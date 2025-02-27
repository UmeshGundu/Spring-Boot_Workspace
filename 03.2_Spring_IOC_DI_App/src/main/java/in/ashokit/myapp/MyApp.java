package in.ashokit.myapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.Restaurant;

public class MyApp {
	public static void main(String[] args) {
             
         ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
         Restaurant  restaurantBean = ctxt.getBean(Restaurant.class);
         restaurantBean.bill();
	}
}
