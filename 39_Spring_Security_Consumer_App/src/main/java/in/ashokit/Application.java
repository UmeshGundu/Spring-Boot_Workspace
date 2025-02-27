package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	/*
	 * programmatically we are trying to send http get request to the provider with
	 * basic(default security) authentication credentials in the request header.
	 */

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		String apiUrl = "http://localhost:8080/msg";

		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("Umesh", "abc");

		HttpEntity<String> reqEntity = new HttpEntity<>(headers);

		RestTemplate rt = new RestTemplate();

		ResponseEntity<String> resEntity = rt.exchange(apiUrl, HttpMethod.GET, reqEntity, String.class);

		System.out.println(resEntity.getBody());

	}

}
