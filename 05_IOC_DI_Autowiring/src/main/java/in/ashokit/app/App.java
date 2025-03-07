package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctxt =
				new ClassPathXmlApplicationContext("beans.xml");
		
        UserService userService = ctxt.getBean(UserService.class);
        
        userService.userRegistration();
	}
}
