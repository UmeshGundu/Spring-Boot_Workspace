package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DataRestController {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "Umesh")
	public String getDataFromRedis() {

		System.out.println("****redis() method is called...*****");

		int i = 10 / 0;

		// TODO: Redis conn logic

		return "Fectching from redis";
	}

	public String getDataFromDB(Throwable t) {

		System.out.println("*****DB() method is called...****");
		// TODO: DB logic

		return "Fetching from DB";
	}
}
