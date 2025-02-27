package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.EmployeeAddressService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		EmployeeAddressService bean = ctxt.getBean(EmployeeAddressService.class);
		// bean.saveData();
		// bean.deleteEmp();
		bean.getAddr();
		

	}

}
