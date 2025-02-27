package in.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokiit.repo.OrderDetailsRepository;
import in.ashokit.entity.OrderDetailsEntity;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		OrderDetailsRepository bean = context.getBean(OrderDetailsRepository.class);

		OrderDetailsEntity entity = new OrderDetailsEntity();
		entity.setOrderBy("Miller");
		entity.setOrderDate(new Date());

		OrderDetailsEntity savedEntity = bean.save(entity);
		System.out.println(savedEntity);

		context.close();
	}

}
