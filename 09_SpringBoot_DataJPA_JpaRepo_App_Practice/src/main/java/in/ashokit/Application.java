package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.WorkerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		WorkerService bean = context.getBean(WorkerService.class);
		// bean.saveWorkersData();
		// bean.getWorkersSort();
		// bean.getWorkerPagination();
		bean.getWorkersQBE(null, null);
	}

}
