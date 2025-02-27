package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping("/greet")
	public String getGreetMsg() {

		String s = null;
		s.length();

		String msg = "Good Morning!";
		return msg;
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		int i = 10 / 0;

		String msg = "Welcome to Rest-API";
		return msg;
	}

	/*
	 * @ExceptionHandler(value = Exception.class)                           // In this class any exception
	 *                                                                         occurs then this method will excecuted. 
	 *                                                                         
	 *public ResponseEntity<ExInfo>  handleException(Exception e) {
	 * 
	 * String message = e.getMessage();
	 * 
	 * ExInfo exInfo = new ExInfo(); exInfo.setExCode("EX89595");
	 * exInfo.setExMsg(message); exInfo.setExDate(LocalDateTime.now());
	 * 
	 * return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR); }
	 */
}
