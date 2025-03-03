package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.SneakyThrows;

@RestController
public class CourseRestController {

	@GetMapping("/course")
	@SneakyThrows // to avoid writing throws exception
	public ResponseEntity<String> getCourseInfo(@RequestParam("name") String name) {

		String msg = null;

		if ("SBMS".equals(name)) {
			msg = "SBMS will start from jan ending";
			return new ResponseEntity<>(msg, HttpStatus.OK);
		} else if ("JRTP".equals(name)) {
			msg = "JRTP will start feb";
			return new ResponseEntity<>(msg, HttpStatus.OK);
		} else {
			throw new CourseNotFoundException("Course Not Found.!");
		}
	}

}
