package in.ashokit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Course;
import in.ashokit.service.CourseServiceImpl;

@RestController
public class RestControllerCourse {

	@Autowired
	private CourseServiceImpl courseService;

	@PostMapping("/course")
	public ResponseEntity<String> addCourse(@RequestBody Course course) {
		String upload = courseService.upsert(course);
		return new ResponseEntity<>(upload, HttpStatus.CREATED);
	}

	@PutMapping("/course/{id}")
	public ResponseEntity<String> updateCourse(@PathVariable Integer id, @RequestBody Course course) {
		String updated = courseService.upsert(course);
		return new ResponseEntity<>(updated, HttpStatus.OK);
	}

	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getAllCourses() {
		List<Course> courses = courseService.showCourses();
		return new ResponseEntity<>(courses, HttpStatus.OK);
	}

	@GetMapping("/course/{id}")
	public ResponseEntity<Course> getById(@PathVariable Integer id) {
		Course showCourse = courseService.showCourse(id);
		return new ResponseEntity<>(showCourse, HttpStatus.OK);
	}

	@DeleteMapping("/course/{id}")
	public ResponseEntity<String> deleteCourseByUd(@PathVariable Integer id) {
		String deletedCourse = courseService.deleteCourseById(id);
		return new ResponseEntity<>(deletedCourse, HttpStatus.OK);
	}

}
