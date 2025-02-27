package in.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Scheduled(fixedRate = 5000)
	public void demo1() {
		System.out.println("Task Executed demo1() : " + new Date());
	}

	@Scheduled(cron="* * * * * *")
	public void demo2() {
		System.out.println("Task Executed demo2() : " + new Date());
	}
	
	// every hour at the start of the hour : 0 0 * * * *
	
	// every day mrng 8:00 AM : 0 0 8 * *
	
	// every week day at 12:00 PM : 0 0 12 * * MON-FRI
}
