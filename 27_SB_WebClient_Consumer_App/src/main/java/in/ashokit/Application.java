package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import in.ashokit.bindings.Quote;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

//		getRandomQuote();
//		getRandomQuote2();
		getRandomQuote3();
	}

	public static void getRandomQuote() {

		String apiURL = "https://dummyjson.com/quotes/random";

		WebClient webClient = WebClient.create(); // it will provide implementation class object for webclient
													// interface.

		Mono<String> bodyToMono = webClient.get().uri(apiURL) // bodytomono means we are going to send the request and
																// get response in a single shot.
				.retrieve() // bodytoflux means response will come continuously.
				.bodyToMono(String.class);

		// making synchronus call
		String block = bodyToMono.block();

		System.out.println(block);
		System.err.println();
	}

	public static void getRandomQuote2() {

		String apiURL = "https://dummyjson.com/quotes/random";

		WebClient webClient = WebClient.create();
		Mono<Quote> bodyToMono = webClient.get().uri(apiURL).retrieve().bodyToMono(Quote.class);

		Quote block = bodyToMono.block();
		System.out.println(block);
	}

	//asynchronous manner
	public static void getRandomQuote3() { 
		
		String apiURL="https://dummyjson.com/quotes/random";
		
		WebClient webClient = WebClient.create();
		//1
		System.out.println("======Request Sending-start======");
		
		webClient.get()
		         .uri(apiURL)
		         .retrieve()
		         .bodyToMono(Quote.class)
		         .subscribe(response ->{
		        	 handleResponse(response); //3
		         });
		//2        
		System.out.println("=====Request sending-completed=====");
	}
	

	private static void handleResponse(Quote response) {
		System.out.println(response);
        // push response to Kafka server
	}

}
