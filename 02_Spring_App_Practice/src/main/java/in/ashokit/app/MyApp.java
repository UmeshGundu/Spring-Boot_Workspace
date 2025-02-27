package in.ashokit.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ashokit.beans.UserService;

public class MyApp {

	public static void main(String[] args) {

		ApplicationContext ctxt = new ClassPathXmlApplicationContext("SpringBeans.xml");
		UserService bean = ctxt.getBean(UserService.class);
		bean.saveUser("Umesh", "Umesh@349", 343532l);
	}

}
