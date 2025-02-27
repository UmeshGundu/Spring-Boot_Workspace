package in.ashokit.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.ashokit.rest.CourseNotFoundException;

@RestControllerAdvice             // making this class as a global exception handler class .
public class AppExHandler {       // if it is webmvc app then u have to send error page to ui then use
							      // @controlleradvice

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> handleException(Exception e) {

		String message = e.getMessage();

		ExInfo exInfo = new ExInfo();
		exInfo.setExCode("EX89595");
		exInfo.setExMsg(message);
		exInfo.setExDate(LocalDateTime.now());

		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = CourseNotFoundException.class)
	public ResponseEntity<ExInfo> handleException(CourseNotFoundException e) {

		String message = e.getMessage();

		ExInfo exInfo = new ExInfo();
		exInfo.setExCode("EXCourse89595");
		exInfo.setExMsg(message);
		exInfo.setExDate(LocalDateTime.now());

		return new ResponseEntity<>(exInfo, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
