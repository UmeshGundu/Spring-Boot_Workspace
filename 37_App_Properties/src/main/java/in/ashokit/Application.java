package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
 * This is the entry point of the Spring Boot application.
 * 
 * @SpringBootApplication enables: Auto-configuration Component scanning in the
 * in.ashokit package. Spring Boot's configuration properties support. SpringApp
 * lication.run(Application.class, args); starts the application.
 */


/*
 * This class binds external properties from application.properties
 * using @ConfigurationProperties.
 * 
 * @Component makes it a Spring Bean.
 * 
 * @Data (Lombok annotation) generates getters, setters, toString(), equals(),
 * and hashCode().
 * 
 * @ConfigurationProperties(prefix = "app") tells Spring Boot to look for
 * properties that start with app. The messages map stores key-value pairs for
 * messages.
 */


/*
 * @RestController makes this class a REST API controller.
 * 
 * @Autowired injects the AppProps bean, allowing access to configuration
 * properties. Endpoints: /greet: Returns the greet.msg message. /welcome:
 * Returns the welcome.msg message. Messages are retrieved from the AppProps
 * object.
 */

/*
 * Defines key-value pairs under the app.messages prefix. greet.msg and
 * welcome.msg are used in the REST API. Other messages are stored for potential
 * future use.
 */

/*
 * How it Works
 *  Spring Boot starts and loads application.properties. AppProps
 * automatically binds messages into a Map<String, String>. The
 * MsgRestController reads messages and serves them via REST APIs. When /greet
 * is called, it returns "good morning". When /welcome is called, it returns
 * "Welcome to Ashokit".
 */