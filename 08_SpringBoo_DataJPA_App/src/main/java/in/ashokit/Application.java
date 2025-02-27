package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserService userServBean = context.getBean(UserService.class);
		// userServBean.saveUser();
		// userServBean.deletAllUsers();
		// userServBean.saveAllUsers();
		// userServBean.getAllUsers();
		// userServBean.getUserById(2);
		// userServBean.getCount();
		// userServBean.getUsersByCountry("India");
		// userServBean.getUsersByCountryAndGender("India", "male");
		// userServBean.getBySalary(60000.0);
		// userServBean.getAllUsersHQL();
		// userServBean.getAllUsersSQL();
		// userServBean.setSalaryHQL(1, 88000.0);
		userServBean.setSalarySQL(3, 98000.0);
	}

}
