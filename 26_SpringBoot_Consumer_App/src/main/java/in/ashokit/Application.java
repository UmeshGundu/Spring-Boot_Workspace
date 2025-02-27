package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import in.ashokit.bindings.Quote;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// getWelcomeMsg();
		getRandomQuote();
	}

	private static void getWelcomeMsg() {

		String apiURL = "https://api.restful-api.dev/objects/";

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class); // whatever the response we are
																					// getting from the provider talke
																					// it and store it a string
																					// variable.

		System.out.println(forEntity.getStatusCode().value());
		System.out.println(forEntity.getBody());
	}

	public static void getRandomQuote() {

		String apiURL = "https://dummyjson.com/quotes/random";

		RestTemplate rt = new RestTemplate();

		// ResponseEntity<String> forEntity = rt.getForEntity(apiURL, String.class);
		ResponseEntity<Quote> forEntity = rt.getForEntity(apiURL, Quote.class);        //getforEntity is used to send get request to the provider programmatically.
		
		System.out.println(forEntity.getBody());
	}

}


//access a third party rest api and create a webmvc 
//project where it should take the data and display it webpage like a table.
//https://dummyjson.com/quotes



